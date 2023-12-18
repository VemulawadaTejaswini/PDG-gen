import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int X = sc.nextInt();
	        int Y = sc.nextInt();
	        if(X>Y) {
	        	int tmp=X;
	        	X=Y;Y=X;
	        }
	        
	        int[] ans=new int[N];
	        for(int i=1;i<=N-1;i++) {
	        	for(int j=i+1;j<=N;j++) {
	        		int min=j-i;
	        		min=Math.min(min, Math.abs(X-i)+1+Math.abs(Y-j));
	        		ans[min-1]++;
	        	}
	        }
	        
	        for(int i=0;i<N-1;i++) {
	        	System.out.println(ans[i]);
	        }
	        	        	        
	 }
}
