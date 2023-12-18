
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		int N = Integer.parseInt(line);
		line = sc.nextLine();
		String[] lines = line.split(" ");
		int[] H = new int[lines.length];

		for (int i = 0; i < lines.length; i++) {
			H[i] = Integer.parseInt(lines[i]);
		}

		boolean flag = true;

		for(int i=N-1; i>0; i--) {
			if(H[i]< H[i-1]) {
				if(H[i-1]-1 <= H[i]) {
					H[i-1]--;
				}else {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
