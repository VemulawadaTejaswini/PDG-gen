import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int num = String.valueOf(n).length();
		int waru = 1;
		int ans = 0;

		if(num == 1) {
			waru = 1;
		}else if(num == 2) {
			waru = 10;
		}else {
			waru = 100;
		}

		if(String.valueOf(n).length() == 1) {
			ans = n;
		}else if(String.valueOf(n).length() == 2){
			ans = n % waru;
		}else {
			ans = n % waru;
			ans %= 10;
		}

		if(ans == 2 || ans == 4 || ans == 5 || ans == 7 || ans == 9) {
			System.out.println("hon");
		}else if(ans == 0 || ans == 1 || ans == 6 || ans == 8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
	}
}
