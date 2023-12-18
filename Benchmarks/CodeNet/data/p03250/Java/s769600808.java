import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] panel = new int[3];
		// 読み込み
		for(int i=0;i<3;i++){
			panel[i] = scan.nextInt();
		}
		// ソート(昇順)
		Arrays.sort(panel);
		
		// 最大値 * 10 + 2番目の大きさ  "+" 最小値
		int max = panel[2]*10 + panel[1] + panel[0];
		
		System.out.println(max);
		

	}

}