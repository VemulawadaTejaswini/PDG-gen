import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();

		// 文字列の入力
		String s = sc.next();
        int ans = 0;
        for(int i = 1; i < n; i++) {
          Set<String> front = new HashSet<>(Arrays.asList(s.substring(0, i).split("")));
          Set<String> back = new HashSet<>(Arrays.asList(s.substring(i, n).split("")));
          int count = 0;
          for(String value : front) {
            if (back.contains(value)) {
              count++;
            }
          }
          if (count > ans) {
            ans = count;
          }
        }
        
    
		// 出力
		System.out.println(ans);
	}
}