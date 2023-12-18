import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double X=sc.nextDouble();
	double a= Math.ceil(X/105);
	int money=0;
	for(int i=(int) a;i<X/100;i++) {
		money=(int) X;
		money-=a*100;
		if(money>=0&&money<=5*a) {
			System.out.println(1);
			System.exit(0);
		}
	}
	System.out.println(0);
}
}