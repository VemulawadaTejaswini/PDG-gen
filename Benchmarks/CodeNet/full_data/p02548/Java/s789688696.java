import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i * i < a ; i++) {
			for (int j = i; i * j < a; j++) {
				if (i == j) {
					cnt += 1;
				} else {
					cnt += 2;
				}
			}
		}
		System.out.println(cnt);
	}
}