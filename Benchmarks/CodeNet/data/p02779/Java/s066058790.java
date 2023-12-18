import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] an = new long[n];
		String answer = "YES";
		for (int i = 0; i < n; i++) {
			an[i] = sc.nextInt();
			//for(int j = 1;j<i+1;j++) {
			//if(an[j]==an[i]) {
			//	answer= "NO";
			//}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (an[i] == an[j]) {
					answer = "NO";
				}
			}

		}
		System.out.print(answer);
	}
}
