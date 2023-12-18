import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
        String ans = "";
        
        if (Math.abs(a - c) <= d) {
          ans = "Yes";
        } else {
          ans = Math.abs(a - b) <= d && Math.abs(b - c) <= c ? "Yes" : "No";
        }
    
		// 出力
		System.out.println(ans);
	}
}
