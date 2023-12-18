import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] m = new int[N];
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	            m[(int)a[i]]++;
	        }
	        long sum=0;
	        for(int i=0;i<N;i++) {
	        	if(m[i]>1) {
	        		sum=sum+m[i]*(m[i]-1)/2;
	        	}
	        }
	        for(int i=0;i<N;i++) {
	        	if(m[(int)a[i]]>1) {
	        		System.out.println(sum-m[(int)a[i]]+1);
	        	} else {
	        		System.out.println(sum);
	        	}
	        }
	        
	 }
}