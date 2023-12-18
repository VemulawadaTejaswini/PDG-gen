import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 1; a < 1000000;a++) {
			for(int b = 1; b < 1000000;b++) {
				for(int c = 1; c < 1000000;c++) {
					for(int d = 1; d < 1000000;d++) {
						for(int e = 1; e < 1000000;e++) {
							if(e < 104) {
								break;
							}
							for(int f = 1; f < 1000000;f++) {
								if(100 * a + 101 * b + 102 * c + 103 * d + 104 * e + 105 * f == n) {
									System.out.println("1");
									return;
								}

								if(n < 105) {
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("0");
	}

}
