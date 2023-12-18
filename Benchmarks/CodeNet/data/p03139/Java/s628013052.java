import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// 標準入力
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		// 入力を入れる配列
		String[] inputAry = new String[3];
		inputAry = input.split(" ");

		// 答え
		int max = 0;
		int min = 0;

		// 総数
		int n = Integer.parseInt(inputAry[0]);
		// A 購読
		int aNum = Integer.parseInt(inputAry[1]);
		// B 購読
		int bNum = Integer.parseInt(inputAry[2]);

		if (aNum == bNum && aNum == n && bNum == n) {
			// 全てが同数
			min = n;
			max = n;
		}

		if ((aNum + bNum) > n) {
			max = aNum<bNum?aNum:bNum;
			min = (aNum + bNum) - n;
		}

		if ((aNum + bNum) < n) {
			max = aNum<bNum?aNum:bNum;
			min = 0;
		}

		System.out.println(max + " " + min);

	}
}
