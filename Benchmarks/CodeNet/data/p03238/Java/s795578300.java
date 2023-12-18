import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int judge = sc.nextInt();
		if(judge == 1) {
			System.out.println("Hello World");
			System.out.println("As N=1, Takahashi is one year old. Thus, we should print Hello World.");
		}
		else {
			int sum = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			System.out.println("As N=2, Takahashi is two years old. Thus, we should print A+B, which is "+(a+b)+"since A="+a+" and B="+b+".");
		}
	}
}
