import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int stArray_to[] = new int[M];
		int stArray_from[] = new int[M];
		int cnt_to = 0;
		int cnt_from = 0;
		
		for (int i = 0; i < M;i ++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((a == 1) & (b != N)){
				stArray_to[cnt_to] = b;
				cnt_to ++ ;
			}
			if ((b == N) & (a != 1)){
				stArray_from[cnt_from] = a;
				cnt_from ++ ;
			}


		}
		if ((cnt_to == 0) | (cnt_from == 0)){
			System.out.println("IMPOSSIBLE ");
			return ;
		}

		for (int i = 0; i < cnt_to;i ++ ){
			for (int j = 0; j < cnt_from;j ++ ){
				if (stArray_to[i] == stArray_from[j]){
					System.out.println("POSSIBLE");
					return ;
				}
			}
		}
		System.out.println("IMPOSSIBLE ");
	}
}
