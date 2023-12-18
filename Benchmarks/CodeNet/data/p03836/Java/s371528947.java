import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int tx = scanner.nextInt();
		int ty = scanner.nextInt();
		scanner.close();
//		String result = "";
//		List<String> result = new ArrayList<String>();
//		String rr = "";
		StringBuilder sb = new StringBuilder();
		// 1回目
		for(int i = 0; i < ty - sy; i++){
//			result += "U";
			sb.append("U");
		}
		for(int i = 0; i < tx - sx; i++){
//			result += "R";
			sb.append("R");
		}

		for(int i = 0; i < ty - sy; i++){
//			result += "D";
			sb.append("D");
		}
		for(int i = 0; i < tx - sx; i++){
//			result += "L";
			sb.append("L");
		}
		/// 2回目
//		result += "L";
		sb.append("L");
		for(int i = 0; i < ty - sy; i++){
//			result += "U";
			sb.append("U");
		}
//		result += "U";
		for(int i = 0; i < tx - sx; i++){
//			result += "R";
			sb.append("R");
		}
//		result += "RDR";
		sb.append("RDR");

		for(int i = 0; i < ty - sy; i++){
//			result += "D";
			sb.append("D");
		}
//		result += "D";
		for(int i = 0; i < tx - sx; i++){
//			result += "L";
			sb.append("L");
		}
//		result += "LU";
		sb.append("LU");

//		System.out.println(result);
		System.out.println(sb);

	}

}
