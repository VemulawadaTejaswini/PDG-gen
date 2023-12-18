import java.util.Scanner;

class main{

	//static long[] a;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int D =sc.nextInt();
		int X =sc.nextInt();
		int[] A =new int[N];
		
		for(int i = 0;i < N;i++){
			A[i] =sc.nextInt();
		}
		
		int ans = 0;
		for(int i =0 ;i < N;i++){
			int day = 1;
			
			for(int j = 0;day <= D;j++){
				day += A[i];
				ans ++;

			}

		}
		System.out.println(ans + X);
	}
}


