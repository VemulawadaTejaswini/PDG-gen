import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		
		int jyuni_m = 1000000000;
		int jyuni_n = 0;
		int ten_m = 0;
		int ten_n = 0;
		for(int i = 0;i < N;i ++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(jyuni_m > a){
				jyuni_m = a;
				ten_m = b;
			}
			if(jyuni_n < a){
				jyuni_n = a;
				ten_n = b;
			}
		}
		int wk = 0;
		int ans = 0;
//*		if ( jyuni_m != 1){
//*			wk = jyuni_m - 1;
//*		}
//*		int ans = jyuni_n + wk;
//*	
//*		if (ten_n != 0){
			ans =  jyuni_n + ten_n;
//*		}
//*			System.out.println(jyuni_m);
		//*			System.out.println(ten_m);
		//*System.out.println(jyuni_n);
		//*System.out.println(ten_n);
			System.out.println(ans);

	}
}
