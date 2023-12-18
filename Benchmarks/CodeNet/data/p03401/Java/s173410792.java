import java.util.Scanner;

class Main{

	//static long[] a;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] A =new int[N+1];

		int sum = 0;
		int p = 0;
		for(int i = 0;i < N;i++){					///合計の算出
			A[i] =sc.nextInt();
			sum +=  Math.abs(A[i] - p);
			p = A[i];
		}
		A[N] = 0;
		sum +=  Math.abs(A[N] - p);


		int[] ans = new int[N];

		for(int i= 0;i < N;i++){
			int subp = 0;

			if(i == 0){
				subp = 0;
			}else{
				subp = A[i-1];
			}
			int subsum1 = 0;
			subsum1 = Math.abs(A[i] - subp);
			subp = A[i];
			subsum1 +=Math.abs(A[i+1] - subp);

			int subsum2 = 0;
			if(i == 0){
				subsum2 = Math.abs(A[i+1] - 0);
			}else{
				subsum2 = Math.abs(A[i+1] - A[i-1]);
			}
			ans[i] = sum - Math.abs(subsum1-subsum2);
		}

		for(int i = 0;i < N;i++){
			System.out.println(ans[i]);
		}

	}
}


