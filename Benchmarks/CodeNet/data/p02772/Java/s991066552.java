import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a <= b){
			String x = "";
			for(int i = 0 ; i<b ; i++){
				x = x + Integer.toString(a);
			}
			System.out.println(x);
		}else{
			String x = "";
			for(int i = 0 ; i<a ; i++){
				x = x + Integer.toString(b);
			}
			System.out.println(x);
		}
	}
};
