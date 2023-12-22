import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0; i < n; i++){
		    hs.add(sc.next());
		}
		
		// 計算
		int result = 0;
		result = hs.size();
		
		// 出力
		System.out.println(result);
	}
}

