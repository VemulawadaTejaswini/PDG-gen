import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int p = 700;

		// 文字列の入力
		String s = sc.next();

		String[] sr = s.split("");

		for(String ss : sr) {
			if("o".equals(ss)) {
				p += 100;
			}
		}

		// 出力
		System.out.println(p);
	}
}