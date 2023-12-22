import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();
		int ans = 1;

		for(int count = num; count > 1; count--) {
			ans = ans * count;
		}

		System.out.println(ans);
		ans = 0;
	}

}