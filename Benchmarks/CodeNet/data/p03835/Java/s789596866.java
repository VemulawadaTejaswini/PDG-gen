import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int count = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				for (int l = 0; l < K; l++) {
					if(i + j + l == S) {
						 count++;
					}

				}
			}
		}
		System.out.println(count);


	}

}
import java.util.Scanner;

public class abc051b {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int count = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				for (int l = 0; l < K; l++) {
					if(i + j + l == S) {
						 count++;
					}

				}
			}
		}
		System.out.println(count);


	}

}
