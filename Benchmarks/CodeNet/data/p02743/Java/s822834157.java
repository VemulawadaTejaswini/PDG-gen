import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a,b,c;
    long double ha,hb,hc;
    a=sc.nextLong();
    b=sc.nextLong();
    c=sc.nextLong();
    ha=Math.sqrt((long double)a);
    hb=Math.sqrt((long double)b);
    hc=Math.sqrt((long double)c);
    if(hc<2*Math.sqrt(ha*hb)){
      System.out.print("No");
    }else{
	    if((ha+hb)<hc){
	      System.out.print("Yes");
    	}else{
    	  System.out.print("No");
    	}
    }
  }
}