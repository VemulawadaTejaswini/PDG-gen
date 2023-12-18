import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();


		if(a<=x && x <= a+b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}


	}

	public static int res(int n) {
		if(n==1) {
			return 1;
		}

		return n+res(n-1);
	}
}


