import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int flag = 2*x==W && 2*y==H ? 1 : 0;
		
		System.out.println((double)W*H/2+" "+flag);
	}		
}
