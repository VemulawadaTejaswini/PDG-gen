import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double c =0.0;
		double aa = 0.5*(h*60+m);
      	double bb = 6*m;
      	double cc = Math.abs(aa - bb);
      	if (cc>180) {
          cc = 360-cc;
        }
      double cos = Math.cos(Math.toRadians(cc));
		c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*cos);

		System.out.println(c);
	}
}
