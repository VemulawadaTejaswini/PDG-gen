import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int ab = b - a;
			int souwa = 0;
			for(int i = 1;i <= ab;i++ ){
				souwa = souwa + i;
			}
			int ans = souwa - b;
       		// 出力
			System.out.println(ans);
			return ;
		}
}
