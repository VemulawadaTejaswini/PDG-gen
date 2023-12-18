import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for(int i = 0; i < a; i++) {
			int tmp = (i+1) * (i + 2) / 2 - a;
			if(tmp <= 0) continue;
			for(int r = 0; r <b; r++) {
				if(tmp - ((r+1) * (r + 2) / 2 - b) == 0) {
					System.out.println(tmp);
				}
			}
		}
	}

}
