import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;



	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextInt();
		int[] l = new int[N];
		for(int i = 0;i < N;i++){
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		int ans = 0;
		for(int i = N-1;i >N-M-1;i--){
			ans += l[i];
		}
		
		System.out.println(ans);

	}

}


