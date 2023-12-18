import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int answer = 0;
		String nStr = "";
		for (int i = 0; i < N; i++) {
			nStr = String.valueOf(i);
			if (nStr.indexOf('3') != -1 && nStr.indexOf('5') != -1 && nStr.indexOf('7') != -1) answer++;
		}

		System.out.println(answer);
	}
}