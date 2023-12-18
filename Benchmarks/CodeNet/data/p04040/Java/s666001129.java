
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long H=gl();
         long W=gl();
         long A=gl();
         long B=gl();
         long ans=0;
         long p=1000000007;
         
         long t=H-A-1;
         long y=W-1;
         long n=t+y;
         long tmp=1;

         while(n>Math.max(t, y)) {
        	 tmp=(tmp*n)%p;
        	 n--;
         }
         long min=Math.min(t, y);
         while(min>0) {
        	 tmp=(tmp*modpow(min, p-2, p))%p;
        	 min--;
         }


         long t2=A-1;
         long y2=0;
         long n2=t2+y2;
         long tmp2=1;
         while(n2>Math.max(t2, y2)) {
        	 tmp2=(tmp2*n2)%p;
        	 n2--;
         }
         long min2=Math.min(t2, y2);
         while(min2>0) {
        	 tmp2=(tmp2*modpow(min2, p-2, p))%p;
        	 min2--;
         }
         long tmp3=(tmp*tmp2)%p;
         ans=(ans+tmp3)%p;
         for(long i=1; i<W-B;i++) {
             tmp=(tmp*(W-i))%p;
             tmp=(tmp*modpow(t+W-i,p-2,p))%p;
             
             tmp2=(tmp2*(A+i-1))%p;
             tmp2=(tmp2*modpow(i,p-2,p))%p;
             
             tmp3=(tmp*tmp2)%p;
             ans=(ans+tmp3)%p;
         }
         System.out.println(ans);
     }

  // a^nをmodで割ったあまり
 	public static long modpow(long a, long n, long mod) {
 		long res=1;
 		while(n>0) {
 			if((n & 1) == 1) res=res*a%mod;
 			a=a*a%mod;
 			n=n>>1;
 		}

 		return res;
 	}

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}