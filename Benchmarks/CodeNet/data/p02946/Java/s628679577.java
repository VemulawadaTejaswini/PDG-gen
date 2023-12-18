import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		// スペース区切りの整数の入力
		int X = sc.nextInt();

		int min = X - K + 1;
		if(min < -1000000){
			min = -1000000;
		}
		int max = X + K - 1;
		if(max > 1000000){
			max = 1000000;
		}
		for(int i = min; i <= max; i++){
			System.out.print(i+ " " );
		}
	}
}