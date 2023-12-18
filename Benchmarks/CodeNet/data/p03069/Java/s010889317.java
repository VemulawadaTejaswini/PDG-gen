import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		String str = sc.next();
		String BLACK = "#";
		String WHITE = ".";
		int count =0;

		for (int i = 0; i < n; i++) {
			String s = str.substring(i,i+1);
			if(BLACK.equals(s)){
				if(i==n-1){
					continue;
				}
				String nextStr = str.substring(i+1,i+2);
				if(WHITE.equals(nextStr)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}