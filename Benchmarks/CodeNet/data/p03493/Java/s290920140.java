import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String numStr = sc.next();
		
		int num = 0;
		num = '1' == numStr.charAt(0) ? num += 1 : num;
		num = '1' == numStr.charAt(1) ? num += 1 : num;
		num = '1' == numStr.charAt(2) ? num += 1 : num;
		
		System.out.println(num);
	}
}