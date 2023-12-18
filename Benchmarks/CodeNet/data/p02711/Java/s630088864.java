
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split("");
		boolean flag7 = false;

		for(int i = 0; i < lines.length; i++) {
			int N = Integer.parseInt(lines[i]);
			if(N == 7) {
				flag7 = true;
				break;
			}else {
				flag7 = false;
			}
		}

		if(flag7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
