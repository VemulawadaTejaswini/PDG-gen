import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		Pair[] pairs = new Pair[N];


		for(int i = 0;i < N;i++){

			Pair pair = new Pair();
			pair.from = sc.nextInt();;
			pair.end = sc.nextInt();;
			pairs[i] = pair;
		}
		Arrays.sort(pairs);
		long ans = 0l;
		int count = 0;
		
		for(int i = 0;i < N;i++){
			for(int j = 0;j < pairs[i].end;j++){
				ans += pairs[i].from;
				count++;
				if(count == M){
					System.out.print(ans);
					return;
				}
			}
		}


	}


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


