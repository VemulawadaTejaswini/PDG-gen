import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		int total = 0;
		boolean flg = true;
		//多重ループを抜けるためのラベル
		outside:for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(i + j + k > N) continue;
					total = i * 10000 + j * 5000 + k * 1000;
					if(total == Y) {
						System.out.println(i + " " + j + " " + k);
						flg = false;
						break outside;
					}
				}
			}
		}
		if(flg) {
		System.out.println(-1 + " " + -1 + " " + -1);
		}
	}

}