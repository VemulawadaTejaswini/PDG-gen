import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      double wk =0;
      double S1 =0;
      double S2 =0;
      int flg=0;
      double W = sc.nextLong();
      double H = sc.nextLong();
      double x = sc.nextLong();
      double y = sc.nextLong();
      
      
	  if(x<W/2) {
		  wk = x;
	  } else {
    	  wk = W - x;    		  
	  }
	  S1=H*wk;

	  if(y<H/2) {
		  wk = y;
	  } else {
    	  wk = H - y;    		  
	  }	  
	  S2=W*wk;    	  

	  
      if(W==H) {
    	  flg=1;
      }
      if(S1==S2) {
    	  flg=1;
      }
      if(S1>S2 && H/2==y && (x!=W || x!=0)) {
    	  flg=1;
      }
      if(S1<S2 && W/2==x && (y!=H || y!=0)) {
    	  flg=1;
      }
      
	  System.out.println(Math.max(S1, S2) + " " + flg);
  }
  
 
}