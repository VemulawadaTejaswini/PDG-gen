
import java.util.*;
import java.text.*;

class Main{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
	  double r = s.nextDouble();
	  double m = r*r*3.1415926;
	  double n = 2*r*3.1415926;
	  DecimalFormat fm = new DecimalFormat("#.######");
      System.out.println(fm.format(m)+" "+fm.format(n));
	 }
	}