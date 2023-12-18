import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int a = A*10+B+C;
		int b = A+B*10+C;
		int c = A+B+C*10;
		sc.close();
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if(b>=a && b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}

	}

}