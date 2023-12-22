import java.util.*;
import java.lang.Integer.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		int count = 0;
		String tmp = null;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length() - i; j++) {
				tmp = s.substring(i, j);
				int tmpNum = Integer.parseInt(tmp);
				if (tmpNum % 2019 == 0) {
					count++;
				}
				tmp = null;
			}
		}
		System.out.println(count);
	}
}