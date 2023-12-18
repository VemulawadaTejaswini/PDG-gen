import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// A
		int a = sc.nextInt();
		// B
		int b = sc.nextInt();
		int c = sc.nextInt();
		// X
		String s = sc.next();
		// 出力
		
		for (int i = 0; i < b; i++) {
			if (a + i == c) {
				System.out.println("YES");
			}
		}
		
		System.out.println("NO");
		
	}
}

