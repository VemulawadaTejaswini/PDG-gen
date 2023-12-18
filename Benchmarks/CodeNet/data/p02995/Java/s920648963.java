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
      
	  cnt2=(long) (A-1)/C;
	  cnt2=(long) B/C-cnt2;
	  cnt3=(long) (A-1)/D;
	  cnt3=(long) B/D-cnt3;
	  cnt4=(long) (A-1)/lcm;
	  cnt4=(long) B/lcm-cnt4;
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