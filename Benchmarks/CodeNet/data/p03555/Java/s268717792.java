import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for (int i = 0; i <= (int) Math.pow(n,0.5)+1; i++) {
			if (Math.pow(i, 2) <= n && Math.pow(i, 2) > answer) {
				answer = (int) Math.pow(i, 2);	//powはdoubleを返すのでanswerに渡すにはintにキャストする
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
