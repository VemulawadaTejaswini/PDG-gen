import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
    
		// 文字列の入力
		String s = sc.next();
        char w = 'W';
        char e = 'E';
        
        int ans = n;
        for (int leader = 0; leader < n; leader++) {
          String left = "";
          String right = "";
          if (leader != 0) {
            left = s.substring(0, leader);
          }
          if (leader != n) {
            right = s.substring(leader + 1);
          }
          int leftW = simple(left, w);
          int rightE = simple(right, e);
          int difference = leftW + rightE;
          
          if (difference < ans) {
            ans = difference;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
  
  public static int simple(String str, char target){
	int count = 0;

	for(char x: str.toCharArray()){
		if(x == target){
			count++;
		}
	}

	return count;
}
}