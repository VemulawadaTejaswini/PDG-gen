import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int countfour = 0;
		int counttwo = 0;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			if (temp % 4 == 0) {
				countfour++;
			} else if (temp % 2 == 0) {
				counttwo++;
			}
		}
		int ans = n - counttwo / 2;
		if(ans % 2 == 1){
			ans = ans + 1;
		}
		if (countfour >= ans / 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
