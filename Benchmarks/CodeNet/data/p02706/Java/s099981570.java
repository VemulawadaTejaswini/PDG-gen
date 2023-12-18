import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int D = sc.nextInt();
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long sum =0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	            sum=sum+a[i];
	        }
	        long ans=D-sum;
	        if(ans<0)ans=-1;
	        System.out.println(ans);
	 }

}