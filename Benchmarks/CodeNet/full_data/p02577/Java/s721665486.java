import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

		int ans = 0;
		for(int i=0; i<N.length(); i++) {
			ans = (ans+ (int) N.charAt(i))%9;
		}

		if(ans == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
