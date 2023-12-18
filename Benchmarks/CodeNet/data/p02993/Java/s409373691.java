import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String[] sList = sc.next().split("");
      
        String last = "";
        String ans = "Good";
        for(String s : sList) {
          if (s.equals(last)) {
            ans = "Bad";
            break;
          } else {
            last = s;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}