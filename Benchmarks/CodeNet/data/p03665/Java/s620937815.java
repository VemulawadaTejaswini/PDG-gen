import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int P = sc.nextInt();
	        int ocnt=0;
	        int ecnt=0;
	        
	        int h=50;
	        long[][] ncr=new long[h][h];
	        ncr[0][0]=1;
	        for(int i=1;i<h;i++) {
	        	ncr[i][0]=1;
	        	for(int j=1;j<i;j++) {
	        		ncr[i][j]=ncr[i-1][j-1]+ncr[i-1][j];
	        	}
	        	ncr[i][i]=1;
	        }
	        
	        
	        for(int i=0;i<N;i++) {
	        	int tmp=sc.nextInt();
	        	if(tmp%2==0) {
	        		ecnt++;
	        	} else {
	        		ocnt++;
	        	}
	        }
	        long ec=(long) Math.pow(2, ecnt);
	        long ans=0;
	        for(int i=0;i<=ocnt;i++) {
	        	if(i%2==P) {
	        		if(i==0) {
	        			ans=ans+ec;
	        		} else {
	        			ans=ans+ncr[ocnt][i]*ec;
	        		}
	        	}
	        }
	        System.out.println(ans);
  	        	        
	 }

}