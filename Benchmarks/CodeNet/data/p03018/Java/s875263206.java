import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();

		int ans = 0;
		String t;

		while(true){
			t = s;
			s = s.replaceFirst("ABC","BCA");
			if(s.equals(t))break;
			ans++;
		}

		// 出力
		System.out.println(ans);
	}
}