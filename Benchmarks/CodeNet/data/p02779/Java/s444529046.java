import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] an = new long[n];
		String answer = "YES";
		for (int i = 0; i < n; i++) {
			an[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (an[i] == an[j]&&i!=j) {
					answer = "NO";
					break;
				}
			}
			
		}
		
		System.out.print(answer);
	}
}
