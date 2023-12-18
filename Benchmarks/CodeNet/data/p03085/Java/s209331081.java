import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String b = sc.next();
        String ans = "";
        switch (b) {
          case "A":
            ans = "T";
            break;
          case "T":
            ans = "A";
            break;
          case "C":
            ans = "G";
            break;
          case "G":
            ans = "C";
            break;
        }
    
		// 出力
		System.out.println(ans);
	}
}