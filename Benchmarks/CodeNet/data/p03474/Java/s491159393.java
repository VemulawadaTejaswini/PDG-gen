import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 文字列の入力
		String[] s = sc.next().split("");
        String ans = "Yes";
        for(int i = 0; i < s.length; i++) {
          if (i == a) {
            if (!s[a].equals("-")) {
              ans = "No";
              break;
            }
          } else {
            if (s[i].equals("-")) {
              ans = "No";
              break;
            }
          }
        }
      
		// 出力
		System.out.println(ans);
	}
}