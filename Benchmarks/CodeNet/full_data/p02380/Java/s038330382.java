import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double S,L,h;
        S  = (a*b*Math.sin(Math.toRadians(c)))/2;
        L = a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b+Math.cos(Math.toRadians(c))));
        h = 2*S/a;

        System.out.println(S);
        System.out.println(L);
        System.out.println(h);

        sc.close();
	}


}
