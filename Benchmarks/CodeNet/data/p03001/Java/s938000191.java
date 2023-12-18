import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      double wk =0;
      double S =0;
      int flg=0;
      double W = sc.nextLong();
      double H = sc.nextLong();
      double x = sc.nextLong();
      double y = sc.nextLong();
      
      
      if(W<H) {
    	  if(x<W/2) {
    		  wk = x;
    	  } else {
        	  wk = W - x;    		  
    	  }
    	  S=H*wk;
          if(H/2==y) {
        	  flg = 1;
          }
      } else {
    	  if(y<H/2) {
        	  wk = y;    		  
    	  } else {
    		  wk = H-y;
    	  }
    	  S=W*wk;    	  
          if(W/2==x) {
        	  flg = 1;
          }
      }
      if(W==H) {
    	  flg=1;
      }
      
	  System.out.println(S + " " + flg);
  }
  