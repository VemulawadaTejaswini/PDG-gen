
import java.util.Scanner;

public class Main {

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

		boolean flag = false;
		int countRow = 0;

		if (N == 1) {
			flag = true;
		}else if(H[0] - H[N-1] > 1) {
			flag = false;
		}else {
			/*
			 * 2回減少 = false
			 * 左が右よりも2以上おおきいとき = false
			 */
			for (int i = 0; i < H.length - 1; i++) {
				flag = true;

				if (H[i] - H[i + 1] > 1) {// 左が右よりも2以上おおきいとき = false
					flag = false;
				} else if (H[i] - H[i + 1] == 1) {//差が1であり、
					countRow++;
					// 3 2 3 2 3 = ok == countRow=0,totalCount=2
					// 3 2 2 2 1 = no == countRow =0,  totalCount = 2
					// 3 2 1 2 3 = no
					if(countRow > 1) {
						flag = false;
					}else {

					}

				} else {// H[i] - H[i+1] <= 0の場合
				}

				if (!flag) {
					break;
				} else {

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
