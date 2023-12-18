import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < 1200000000; i++) {
			if(Math.abs(a-i) == Math.abs(b-i)){
				flag =true;
				System.out.println(i);

				break;
			}
		}
		if(!flag){
			System.out.println("IMPOSSIBLE");
		}

	}
}
