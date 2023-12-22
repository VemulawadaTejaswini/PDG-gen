import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] box = new int[3];
		while (sc.hasNext()) {
			for (int i = 0; i < 3; i++) {
				box[i] = sc.nextInt();
			}
			Arrays.sort(box);
			System.out.println((box[0] * box[0] + box[1] * box[1] == box[2]
					* box[2]) ? "YES" : "NO");
		}
	}
}