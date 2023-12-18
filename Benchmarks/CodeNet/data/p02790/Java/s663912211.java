import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = Math.min(a, b);
		int max = a+b - min;
		String ans = "";

		for(int i = 0; i < max; i++) {
			ans = ans + min;
		}

		System.out.println(ans);
        return;
    }

}

