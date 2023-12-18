import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int a=n/3;
		int b=n%3;
		if(b==0)
			System.out.println(a);
		else if(a==0)
			System.out.println("0");
		else
			System.out.println(a+1);
	}
}
