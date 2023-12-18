import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int N = X/100;
		int ans = 0;
		for(int i = 0;i <= N;i++) {
			if((X-i*100 <= 5*i) && (X-i*100) >= 0)ans = 1;
		}
		System.out.println(ans);
	}

}
