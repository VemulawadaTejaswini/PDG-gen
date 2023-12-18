
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		
		n = str.length;
		digits = new int[n];
		
		for(int i = 0; i < n; i++) {
			digits[i] = str[i] - '0';
		}
		
		plus = new boolean[n - 1];
		
		dfs(0);
		
		System.out.println(total);
	}
	
	static int n;
	static int[] digits;
	static boolean[] plus;
	static long total = 0;
	
	static void dfs(int depth) {
		if(depth == n - 1) {
			total += calc();
			return;
		}
		
		plus[depth] = false;
		dfs(depth + 1);
		plus[depth] = true;
		dfs(depth + 1);
	}
	
	static long calc() {
		long result = 0;
		
		long geta = 1;
		
		for(int i = n - 1; i >= 0; i--) {
			result += geta*digits[i];
			
			if(i != 0) {
				if(plus[i - 1]) {
					geta = 1;
				}
				else {
					geta *= 10;
				}
			}
		}
		
		return result;
	}
	
}
