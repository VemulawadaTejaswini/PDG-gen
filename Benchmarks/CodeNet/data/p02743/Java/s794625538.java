import java.util.*;
import static java.lang.System.*;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int c = sc.nextInt();
	  
	  BigDecimal ab = new BigDecimal(a);
	  BigDecimal bb = new BigDecimal(b);
	  BigDecimal cb = new BigDecimal(c);
	  
	  BigDecimal ar = sqrt(ab,50);
	  BigDecimal br = sqrt(bb, 50);
	  BigDecimal cr = sqrt(cb, 50);
	 
	  BigDecimal x = ar.add(br);
	  BigDecimal ans = cr.subtract(x);
	  
	 if( x.compareTo(cr) < 0)
		  out.println("Yes");
	  else
		  out.println("No");
		  
  	}  	
  public static BigDecimal sqrt(BigDecimal a, int scale){
      //とりあえずdoubleのsqrtを求める
      BigDecimal x = new BigDecimal(
              Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
      if(scale < 17) return x;

      BigDecimal b2 = new BigDecimal(2);
      for(int tempScale = 16; tempScale < scale; tempScale *= 2){
          //x = x - (x * x - a) / (2 * x);
          x = x.subtract(
                  x.multiply(x).subtract(a).divide(
                  x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
      }
      return x;
  }
  }	