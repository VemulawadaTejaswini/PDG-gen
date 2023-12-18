import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int count = 1;
		String x = sc.next();
		if(N!=1){
			for(int i = 2;i<=N;i++){
				String y = sc.next();
				if(x!=y){
					count++;
					x=y;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
};