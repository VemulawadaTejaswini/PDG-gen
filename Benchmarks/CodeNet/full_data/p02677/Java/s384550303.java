import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int h=sc.nextInt();
	int m=sc.nextInt();
	int hr=h*30+m/2;
	int min=m/5 * 30 + m%5 * 30/5;
	double diff=(double)Math.abs(hr-min)*(3.141592653589793/180);
	double res= Math.sqrt((a*a + b*b - 2*a*b*Math.cos(diff)));
	System.out.format("%.9f",res);
	}
}

