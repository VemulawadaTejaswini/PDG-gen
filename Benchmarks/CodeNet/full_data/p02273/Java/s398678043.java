import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	double[] p1 = new double[2],p2 = new double[2];
	int n = s.nextInt();
	p1[0] = 0.0;
	p1[1] = 0.0;
	p2[0] = 100.0;
	p2[1] = 0.0;
	System.out.println(p1[0] + " " + p1[1]);
	koch(n,p1,p2);
	System.out.println(p2[0] + " " + p2[1]);
}

static void koch(int n,double[] p1,double[] p2) {
	if(n == 0) return;

	double[] u = new double[2];
	double rot = Math.toRadians(60);
	double[] s = new double[2],t = new double[2];
	s[0] = (2.0 * p1[0] + p2[0]) / 3.0;
	s[1] = (2.0 * p1[1] + p2[1]) / 3.0;
	t[0] = (2.0 * p2[0] + p1[0]) / 3.0;
	t[1] = (2.0 * p2[1] + p1[1]) / 3.0;
	u[0] = (t[0] - s[0]) * Math.cos(rot) - (t[1] - s[1]) * Math.sin(rot) + s[0];
	u[1] = (t[0] - s[0]) * Math.sin(rot) + (t[1] - s[1]) * Math.cos(rot) + s[1];
	koch(n-1,p1,s);
	System.out.println(s[0] + " " + s[1]);
	koch(n-1,s,u);
	System.out.println(u[0] + " " + u[1]);
	koch(n-1,u,t);
	System.out.println(t[0] + " " + t[1]);
	koch(n-1,t,p2);

}
}

