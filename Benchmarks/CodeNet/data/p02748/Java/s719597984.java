import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int M = sc.nextInt();
	        long amin=200000;
	        long bmin=200000;
	        long[] a = new long[A];
	        for (int i=0 ; i<A; i++) {
	            a[i] = Long.parseLong(sc.next());
	            amin=Math.min(amin, a[i]);
	        }
	        long[] b = new long[B];
	        for (int i=0 ; i<B; i++) {
	            b[i] = Long.parseLong(sc.next());
	            bmin=Math.min(bmin, b[i]);
	        }
	        int[] x = new int[M];
	        int[] y = new int[M];
	        long[] c = new long[M];
	        long min=amin+bmin;
	        for (int i=0 ; i<M; i++) {
	            x[i] = Integer.parseInt(sc.next());
	            y[i] = Integer.parseInt(sc.next());
	            c[i] = Long.parseLong(sc.next());
	            min=Math.min(min, a[x[i]-1]+b[y[i]-1]-c[i]);
	        }
	        
	        
	        System.out.println(min);
	 }
}
