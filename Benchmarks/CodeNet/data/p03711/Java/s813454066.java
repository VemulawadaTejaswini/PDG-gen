import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// 計算
		String result = "No";
		if(x == y){
		    System.out.println("Yes");
		    return;
		}
		if(x == 4 || x == 6 || x == 9 || x == 11){
		    if(y == 4 || y == 6 || y == 9 || y == 11) result = "Yes";
		}else{
		    if(!(y == 4 || y == 6 || y == 9 || y == 11 || y == 2)) result = "Yes";
		}
		
		
		// 出力
		System.out.println(result);
	}
}
