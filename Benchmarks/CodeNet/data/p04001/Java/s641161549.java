import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int ans = 0;
		int temp = 0;
		for(int i = 0; i < Math.pow(2, str.length() - 1); i++) {
			StringBuilder sb = new StringBuilder(str);
			int cnt = 0;
			for(int j = 0; j < str.length() - 1; j++) {
				if((1 & i >> j) == 1) {
					sb.insert(j + cnt + 1, ",");
					cnt++;
				}
			}
			String ans_str = sb.toString();
			//System.out.println(ans_str);
			String str_array[] = ans_str.split(",");
			for(String s : str_array) {
				ans += Integer.parseInt(s);
			}
		}
		
		System.out.println(ans);
	}
}
