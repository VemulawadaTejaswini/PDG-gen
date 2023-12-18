import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int M = sc.nextInt();	
	        int ans=0;
	        for(int i=M/N;i>=0;i--) {
	        	int tmp=M;
	        	tmp=tmp-i*N;
	        	if(tmp%i==0) {
	        		ans=i;
	        		System.out.println(ans);
	        		return;
	        	}
	        }
	        
	        
	        
	 }

}