import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int a = sc.nextInt();
		int b = sc.nextInt();

		if((a+b)%2!=0){
			System.out.println("IMPOSSIBLE");
		}else{
			System.out.println((a+b)/2);

		}

	}
}
