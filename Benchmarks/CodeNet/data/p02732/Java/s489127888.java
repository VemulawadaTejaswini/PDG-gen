import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long[] m = new long[N+1];
	        int[] a = new int[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Integer.parseInt(sc.next());
	            m[a[i]]++;
	        }
	        long sum=0;
	        for(int i=0;i<N;i++) {
	        	if(m[i]>1) {
	        		sum=sum+(m[i]/2*(m[i]-1));
	        	}
	        }
	        for(int i=0;i<N;i++) {
	        	if(m[a[i]]>1) {
	        		System.out.println(sum-m[a[i]]+1);
	        	} else {
	        		System.out.println(sum);
	        	}
	        }
	        
	 }
}
