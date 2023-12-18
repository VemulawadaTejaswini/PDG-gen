import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
      	double c = scn.nextDouble();
      	double aa = Math.sqrt(a);
      	double bb = Math.sqrt(b);
      	double cc = Math.sqrt(c);
      	String ans = "No";
      	if(aa + bb < cc) ans = "Yes";
      	System.out.println(ans);
	}
}