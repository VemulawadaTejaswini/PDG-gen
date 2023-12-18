import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int N = s.nextInt()+1;
		int a=2;
		int b=1;
		int ans=0;


		for (int i = 2; i < N; i++) {
			ans=a+b;
			a=b;
			b=ans;

		}

		System.out.println(ans);
	}
}
