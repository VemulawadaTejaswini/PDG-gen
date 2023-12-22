
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new C().doIt();
    }
    class C{
    	class Pair{
    		double S,H;
    		public Pair(double S,double H){
    			this.S = S;
    			this.H = H;
    		}
    	}
    	class H_L{
    		double H,L;
    		public H_L(double H,double L){
    			this.H = H;
    			this.L = L;
    		}
    	}
    	void check(int N){
    		for(int i = 0;i < N;i++){
        		ArrayList<Pair> array2 = new ArrayList<Pair>();
        		array2 = array.get(i);
        		for(int j = 0;j < array2.size();j++){
        			System.out.print(array2.get(j).S+" "+array2.get(j).H+" ");
        		}
        		System.out.println();
        	}
    	}
    	double bitDP(int N,double M){
    		H_L dp[] = new H_L [1 << N];
    		dp[0] = new H_L(0.0,M);
    		for(int i = 0;i < (1 << N);i++){
    			dp[i] = new H_L(0.0,M);
    		}
    		TreeSet<Integer> ts = new TreeSet<Integer>();
    		ArrayList<Integer> num = new ArrayList<Integer>(); 
    		ts.add(0);num.add(0);
    		while(num.size() > 0){
    			int number = num.remove(0);
    			for(int i = 0;i < N;i++){
//    				System.out.println(1 << i);
    				if((number / (1 << i))%2 == 1)continue;
    				int number2 =  number + (1 << i);
    				if(number2 < 0 || number2 > (1 << N)) continue;
    				if(ts.add(number2)){
    					num.add(number2);
    				}
        			ArrayList<Pair> array2 = new ArrayList<Pair>();
        			array2 = array.get(i);
        			int length = array2.size();
        			double lit = dp[number].L;
        			double height = 0;
        			for(int k = 0;k < length;k++){
        				if(array2.get(k).S * array2.get(k).H <= lit){
        					lit = lit - array2.get(k).S * array2.get(k).H;
        					height = height + array2.get(k).H;
        				}else{
        					height = height + (lit / array2.get(k).S);
        					lit = 0;
        				}
        			}
//        			System.out.println(number);
        			dp[number2] = new H_L(Math.max(dp[number2].H,dp[number].H + height),lit);
        		}
    		}
    		double max = 0.0;
    		for(int i = 0;i < (1 << N);i++){
    			max = Math.max(max, dp[i].H);
    		}
    		return max;
    	}
    	ArrayList<ArrayList<Pair>> array = new ArrayList<ArrayList<Pair>>();
        void doIt(){
        	int N = sc.nextInt();
        	double M = sc.nextDouble();
        	for(int i = 0;i < N;i++){
        		int K = sc.nextInt();
        		ArrayList<Pair> array2 = new ArrayList<Pair>();
        		for(int j = 0;j < K;j++){
        			array2.add(new Pair(sc.nextDouble(),sc.nextDouble()));
        		}
        		array.add(array2);
        	}
//        	check(N);
        	System.out.println(bitDP(N,M));
        }
    }
}