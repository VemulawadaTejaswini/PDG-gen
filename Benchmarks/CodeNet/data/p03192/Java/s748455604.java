import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] sList = sc.next().split("");
        int ans = 0;
        for(String s : sList) {
          if (s.equals("2")) {
            ans++;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}