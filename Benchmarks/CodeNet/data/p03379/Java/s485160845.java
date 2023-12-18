import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	//	static int N;
	//	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();

		int[] X = new int[N];


		for(int i = 0;i < N;i++){
			X[i] = sc.nextInt();
		}

		for(int i = 0;i < N;i++){
			int[] sum =new int[N];

			for(int j = 0;j < N;j++){
				if(i != j){
					sum[j] =X[j]; 
				}
			}
			Arrays.sort(sum);
			System.out.println(sum[N/2]);
		}




	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



