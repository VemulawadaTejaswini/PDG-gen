

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		// テキスト入力
		Scanner sc = new Scanner(System.in);
		StringBuilder all_out = new StringBuilder();
		StringBuilder out= new StringBuilder();;

		// 
		while (true) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if (height == 0 && width == 0){
				break;
			}
			// #を出す処理
			// 行の数
			for (int h = 0; h < height; h++) {

				// 列の数
				for (int w = 0; w < width; w++) {
					out = out.append("#");
				}
				out = out.append("\n");
			}
			all_out = all_out.append(out+"\n");
			out.delete(0, out.length());
		}
		System.out.print(all_out);
	}
}