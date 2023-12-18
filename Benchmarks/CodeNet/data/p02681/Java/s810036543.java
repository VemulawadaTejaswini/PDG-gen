import java.util.*;
public class Main {
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if (s1.length()+1 == s2.length()){
			if (s2.startsWith(s1)) {
// 出力
			System.out.println("Yes");
        
			} else {
			// 出力
			System.out.println("No");
        
			}
		}else{
			// 出力
			System.out.println("No");
        }
	}
}

