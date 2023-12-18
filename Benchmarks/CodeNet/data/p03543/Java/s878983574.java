import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=a%10;
		a/=10;
		int c=a%10;
		a/=10;
		int d=a%10;
		a/=10;
		int e=a%10;
		if(b==c&&c==d||c==d&&d==e) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}