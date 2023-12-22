import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		// テキスト入力
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String out = "";

		while (true) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if (height == 0 && width == 0){
				System.out.print("\n");
				break;
			}
			// #を出す処理
			// 行の数
			for (int h = 0; h < height; h++) {

				// 列の数
				for (int w = 0; w < width; w++) {
					out = out+"#";
				}
				out = out+"\n";
			}
			list.add(out);
			out = "";
		}
		for(int index = 0; index < list.size();index++)
		System.out.println(list.get(index));
	}
}