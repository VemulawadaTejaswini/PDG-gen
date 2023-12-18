import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
       
        String[] correct = "CODEFESTIVAL2016".split("");
    
		// 文字列の入力
		String[] input = sc.next().split("");
        int ans = 0;
        for(int i = 0; i < input.length; i++) {
          if (!input[i].equals(correct[i])) {
            ans++;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}