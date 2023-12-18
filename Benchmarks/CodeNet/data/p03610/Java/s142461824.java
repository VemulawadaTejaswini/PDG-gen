import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // 文字列の入力
		String[] s = sc.next().split("");
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
          if (i % 2 == 0) {
            buff.append(s[i]);
          }
        }
    
		// 出力
		System.out.println(buff.toString());
	}
}
