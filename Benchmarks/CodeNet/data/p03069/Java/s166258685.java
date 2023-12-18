import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		////		String line = reader.readLine();
		//		String[] str = reader.readLine().split(" ");
		//		int[] ab = new int[str.length];
		//		for (int i = 0; i < str.length; i++) {
		//			ab[i] = Integer.parseInt(str[i]);
		//		}
		//		if ((ab[0] > ab[2] && ab[2] > ab[1]) || (ab[0] < ab[2] && ab[2] < ab[1])) {
		//			System.out.println("Yes");
		//		}
		//		else {
		//			System.out.println("No");
		//		}

		//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//		String line = reader.readLine();
		//		int N = Integer.parseInt(line);
		//		String[] str = reader.readLine().split("");
		//		line = reader.readLine();
		//		int K = Integer.parseInt(line) -1;
		//		String[] re = new String[N];
		//		for (int i = 0; i < N; i++) {
		//			if (!str[i].equals(str[K])) {
		//				re[i] = "*";
		//			}
		//			else {
		//				re[i] = str[i];
		//			}
		//		}
		//		for (int i = 0; i < N; i++) {
		//			System.out.print(re[i]);
		//		}
		//		System.out.println();

		//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//		String line = reader.readLine();
		//		int N = Integer.parseInt(line);
		//		int[] a = new int[N];
		//		for (int i = 0; i < N; i++) {
		//			line = reader.readLine();
		//			
		//		}

//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		int N = Integer.parseInt(line);
//		String[] str = reader.readLine().split("");
//		int ans = 0;
//		int[] kosuu = new int[N];
////		for (int i = 0; i < N; i++) {
////			if (i < str.length - 1) {
////				if (str[i].equals("#") && str[i+1].equals(".")) {
////					for (int j = i; j < N; j++) {
////						if (str[j].equals(".")) {
////							ans++;
////						}
////					}
////					break;
////				}
////			}
//		int kosuu_i = 0;
//		boolean white_bool = false;
//		for (int i = 0; i < N; i++) {
//			if (i == 0) {
//				kosuu[kosuu_i] = 1;
//				if (str[i].equals(".")) {
//					white_bool = true;
//				}
//			}
//			else {
//				if (!str[i-1].equals(str[i])) {
//					kosuu_i++;
//					kosuu[kosuu_i]++;
//				}
//				else {
//					kosuu[kosuu_i]++;
//				}
//			}
//		}
//		int[] ans_kouho = new int[6];
////		int white = ans_kouho[0];
////		int black = ans_kouho[1];
////		int white_right_black = ans_kouho[2];
////		int white_left_black = ans_kouho[3];
////		int black_right_white = ans_kouho[4];
////		int black_left_white = ans_kouho[5];
//		if (white_bool && kosuu_i % 2 == 0) {  //左は白，右は白
//		    for (int i = 0; i < kosuu_i; i++) {
//				if (i % 2 == 0 && i > 0) {
//					ans_kouho[0] += kosuu[i];
//				}
//				else if (i % 2 == 1) {
//					ans_kouho[1] += kosuu[i];
//				}
//			}
//		    ans_kouho[2] = ans_kouho[0] - kosuu[kosuu_i - 2] + kosuu[kosuu_i - 1];
//			ans_kouho[3] = ans_kouho[0] - kosuu[2] + kosuu[1];
//		}
//		
//		if (white_bool && kosuu_i % 2 == 1) {  //左は白，右は黒
//		    for (int i = 0; i < kosuu_i; i++) {
//				if (i % 2 == 0 && i > 0) {
//					ans_kouho[0] += kosuu[i];
//				}
//				else if (i % 2 == 1) {
//					ans_kouho[1] += kosuu[i];
//				}
//			}
//		}
//		
//		if (!white_bool && kosuu_i % 2 == 0) {  //左は黒，右は黒
//		    for (int i = 0; i < kosuu_i; i++) {
//		    	if (i % 2 == 0 && i > 0) {
//					ans_kouho[1] += kosuu[i];
//				}
//				else if (i % 2 == 1) {
//					ans_kouho[0] += kosuu[i];
//				}
//			}
//		}
//		
//		if (!white_bool && kosuu_i % 2 == 1) {  //左は黒，右は白
//		    for (int i = 0; i < kosuu_i; i++) {
//		    	if (i % 2 == 0 && i > 0) {
//					ans_kouho[1] += kosuu[i];
//				}
//				else if (i % 2 == 1) {
//					ans_kouho[0] += kosuu[i];
//				}
//			}
////			int black_right_white = ans_kouho[4];
////			int black_left_white = ans_kouho[5];
//		    ans_kouho[4] = ans_kouho[0] - kosuu[kosuu_i - 2] + kosuu[kosuu_i - 1];
//			ans_kouho[5] = ans_kouho[0] - kosuu[2] + kosuu[1];
//		}
//
//		ans = N;
//		for (int i = 0; i < 6; i++) {
//			if (ans_kouho[i] < ans && ans_kouho[i] != 0) {
//				ans = ans_kouho[i];
//			}
//		}
//		System.out.println(ans);
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		String[] str = reader.readLine().split("");
		int ans = N;
		int white = 0;
		int black = 0;
		int[] ans_j = new int[N];
		for (int j = 0; j < N; j++) {
			if (str[j].equals(".")) {
				white++;
			}
		}
		for (int j = 0; j < N; j++) {
			if (str[j].equals("#")) {
				black++;
			}
			if (str[j].equals(".")) {
				white--;
			}
			ans_j[j] = black + white;
		}
		for (int i = 0; i < N; i++) {
			if (ans_j[i] < ans) {
				ans = ans_j[i];
			}
		}
		System.out.println(ans);
	}
}