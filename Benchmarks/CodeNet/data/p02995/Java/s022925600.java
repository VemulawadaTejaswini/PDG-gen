import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      int flg=0;
      long A = sc.nextLong();
      long B = sc.nextLong();
      long C = sc.nextInt();
      long D = sc.nextInt();
      
      long lcm = LCM(C,D);
      
      cnt = -A+B+1;
      long cnt2 = 0;
      long cnt3 = 0;
      long cnt4 = 0;
      
      for(long i=A;i<B+1;i++) {
    	  if(i%C!=0) {
    		  cnt2=cnt-i+A;
    		  cnt2=cnt2/C+1;
    		  break;
    	  }
      }
      for(long i=A;i<B+1;i++) {
    	  if(i%D!=0) {
    		  cnt3=cnt-i+A;
    		  cnt3=cnt3/D+1;
    		  break;
    	  }
      }
      for(long i=A;i<B+1;i++) {
    	  if(i%lcm!=0) {
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