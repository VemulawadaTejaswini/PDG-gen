import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] data = new int[N];
		int ans = 0;
		boolean flag = true;
		for(int i = 0;i < data.length;i++){		//入力
			data[i] = scanner.nextInt();

		}
		
		int[] count = new int[2000001];
		for(int i = 0;i < data.length;i++){			//頻度を記録
			count[data[i]]++;
		}
		Arrays.sort(count);						//少ない順にそーと
		for(int i = count.length-1-K;i >= 0;i --){							//多い順にK番目までを取り除き、それ以外のを全部加える
			ans += count[i];
		}
		
		System.out.println(ans);

	}


}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

