import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		double a = scn.nextDouble();
		double b = scn.nextDouble();
      	double c = scn.nextDouble();
      	double x = 2*(a*b + b*c + c*a);
      	double y = a*a + b*b + c*c;
      	double z = c - a - b;
      	String ans = "No";
      	if(z>0 && x<y) ans = "Yes";
      	System.out.println(ans);
	}
}
