import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] up = sc.next().split("");
        String[] down = sc.next().split("");
      
        String ans = "YES";
        for(int i = 0; i < 3; i++) {
          if (!up[i].equals(down[2 - i])) {
            ans = "NO";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}
