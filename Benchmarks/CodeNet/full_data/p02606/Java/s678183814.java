
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int L = Integer.parseInt(lines[0]);
		int R = Integer.parseInt(lines[1]);
		int d = Integer.parseInt(lines[2]);
		int count = 0;

		for(int i = L; i <= R; i++) {
			if(i % d == 0) {
				count++;
			}
		}

		System.out.println(count);
	}

}
