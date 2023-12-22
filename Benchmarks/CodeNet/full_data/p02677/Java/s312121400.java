import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int h=sc.nextInt();
	int m=sc.nextInt();
	double angleh=((h*60+m)*360/(12*60));
	double anglem=(m*6);
	double angle = Math.abs(anglem-anglem);

	double result = Math.cos(Math.toRadians(angle));
	double ans = Math.sqrt(a*a+b*b-2*a*b*result);
	System.out.println(ans);
	}
}