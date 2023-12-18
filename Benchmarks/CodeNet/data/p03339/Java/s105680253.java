import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
    
		// 文字列の入力
		String s = sc.next();
      
        String[] list = s.split("");
        
        int ans = n;
        for (int leader = 0; leader < n; leader++) {
          String[] standard = new String[n];
          for (int index = 0; index < n; index++) {
            if (index == leader) {
              standard[index] = list[index];
            } else {
              standard[index] = index < leader ? "E" : "W";
            }
          }
          int difference = 0;
          for (int i = 0; i < n; i++) {
            if (!list[i].equals(standard[i])){
              difference++;
            }
          }
          if (difference < ans) {
            ans = difference;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}