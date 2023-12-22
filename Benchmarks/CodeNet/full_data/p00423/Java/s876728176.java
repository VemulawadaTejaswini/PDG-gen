import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		while((n = sc.nextInt()) != 0) {
			run(n);
		}
	}

	static void run(int n) {
		int A=0, B=0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a>b) A += a+b;
			else if(b>a) B += a+b;
			else {
				A += a;
				B += b;
			}
		}

		System.out.println(A + " " + B);
	}

}