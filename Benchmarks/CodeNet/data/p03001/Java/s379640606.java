import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cx = W/2;
		int cy = H/2;

		System.out.println(W*H*0.5);

		if(x == cx && y == cy){
			System.out.println(1);
		}else{
			System.out.println(0);
		}

		sc.close();
	}
};
