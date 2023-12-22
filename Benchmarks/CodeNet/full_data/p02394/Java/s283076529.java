import java.util.*;
import java.net.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(solve(w, h, x, y, r));
		
	}
	
	private static String solve(int w, int h, int x, int y, int r) {
		
		// 上端チェック
		if (h < y+r) return "No";
		
		// 下端チェック
		if (0 > y-r) return "No";
		
		// 左端チェック
		if (0 > x-r) return "No";
		
		// 右端チェック
		if (w < x+r) return "No";
		
		return "Yes";
	}
}
