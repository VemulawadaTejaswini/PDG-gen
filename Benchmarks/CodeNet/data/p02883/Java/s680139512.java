import java.util.*;
import java.util.Map.Entry;
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long N;
	 static long K;
	 static Integer[]a;
	 static Integer[]f;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       K = sc.nextLong();

       a = new Integer[(int)N];
       long max=0;
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextInt();
       }
       f = new Integer[(int)N];
       for (int i=0 ; i<N; i++) {
           f[i] = sc.nextInt();
       }

       Arrays.sort(a);
       Arrays.sort(f,Collections.reverseOrder());
       long left=0;
       long right=2200200200200200200l;
//	   right=Long.MAX_VALUE;
//     right=9;
	   left=-1;
	   while(right-left>1) {
		   long mid=left+(right-left)/2;
		   if(IsOK(mid)) right=mid;
		   else left=mid;
	   }
       
       System.out.println(right);
   }
   
   public static boolean IsOK(long p) {
	   long cnt=0;
	   long tmp=0;
	   for(int i=0;i<N;i++) {
		   tmp=a[i]-p/f[i];
		   if(tmp<0) {
			   tmp=0;
		   }   
		   cnt=cnt+tmp;
	   }

	   return cnt<=K;
   }
}