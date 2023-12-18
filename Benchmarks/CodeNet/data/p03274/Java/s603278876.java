import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N= sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;i++){
			x[i] = sc.nextInt();
		}
		int[] dis = new int[N-K];
		for(int i = 0;i < N-K;i++){
			dis[i] =Math.min(Math.abs(x[i]) + Math.abs(x[i+K-1] - x[i]),Math.abs(x[i+K-1]) + Math.abs(x[i+K-1] - x[i]));
		}
		if(N == 1){
			System.out.println(Math.abs(x[0]));
			return;
		}
		long ans = 1000000000;
		for(int i = 0;i < N-K;i++){
			ans = Math.min(ans, dis[i]);
		}
		System.out.println(ans);

	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

