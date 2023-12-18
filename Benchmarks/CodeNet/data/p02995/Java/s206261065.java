
import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      int flg=0;
      long A = sc.nextLong();
      long B = sc.nextLong();
      long C = sc.nextLong();
      long D = sc.nextLong();
      
      long lcm = LCM(C,D);
      
      cnt = -A+B+1;
      long cnt2 = 0;
      long cnt3 = 0;
      long cnt4 = 0;
      
      for(long i=0;i<B+1;i=i+C) {
    	  if(A<=i && i<=B) {
    		  cnt2=cnt-i+A;
    		  cnt2=cnt2/C+1;
    		  break;
    	  }
      }
      for(long i=0;i<B+1;i=i+D) {
    	  if(A<=i && i<=B) {
    		  cnt3=cnt-i+A;
    		  cnt3=cnt3/D+1;
    		  break;
    	  }
      }
      for(long i=0;i<B+1;i=i+lcm) {
    	  if(A<=i && i<=B) {
    		  cnt4=cnt-i+A;
    		  cnt4=cnt4/lcm+1;
    		  break;
    	  }
      }
//      System.out.println(cnt);    	  
//      System.out.println(cnt2);    	  
//      System.out.println(cnt3);    	  
//      System.out.println(cnt4);    	  
      
      System.out.println(cnt-cnt2-cnt3+cnt4);    	  
  }
  
  static long GCD(long a,long b) {
	  long tmp;
	  long r;
	  if(a<b) {
		  tmp = a;
		  a = b;
		  b = tmp;				  
	  }
	  
	  r = a % b;
	  while(r!=0) {
		  a=b;
		  b=r;
		  r=a%b;
	  }
	  
	  return b;
  }
  
  static long LCM(long a,long b) {
	  return a*b/GCD(a,b);
  }
}