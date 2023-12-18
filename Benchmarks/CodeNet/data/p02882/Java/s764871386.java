import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int x=sc.nextInt();
	double y=(double)2*x/(double)(a*b*b);
	double ans=Math.atan(y);
	ans=180*ans/Math.PI;
	ans=90-ans;
	System.out.println(ans);
	}}