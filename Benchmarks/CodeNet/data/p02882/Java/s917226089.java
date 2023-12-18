import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double a=stdIn.nextInt();
		double b=stdIn.nextInt();
		double x=stdIn.nextInt();
		double key=90;
		if(x>=a*a*b/2)
			x=a*a*b-x;
		else
			key=0;
		double ans=(x/a)*2/a;
		System.out.println(Math.abs(key-Math.toDegrees(Math.atan(a/ans))));
	}
}