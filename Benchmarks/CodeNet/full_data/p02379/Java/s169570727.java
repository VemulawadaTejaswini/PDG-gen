import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double d=sc.nextDouble();
	System.out.println(Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2)));
	}
}

