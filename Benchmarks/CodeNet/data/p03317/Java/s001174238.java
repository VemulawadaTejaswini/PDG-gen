import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int K =sc.nextInt();
		int[] a = new int[N];
		for(int i =0 ;i< N;i++){
			a[i] = sc.nextInt();
		}
		int[] sub = a.clone();
		Arrays.sort(sub);
		int min = sub[0];
		int right = 0;
		for(int i = 0;i < N;i++){
			if(min == a[i]){
				right = i;
				break;
			}
		}
		
		int ans = 0;
		
		if(N>=3 && a[1]==min && a[0] != min && a[2] != min) {
			a[0] = min;
			a[2] = min;
			ans++;
		}
		if(N>=3 && a[N-2]==min && a[N-1] != min && a[N-3] != min){
			a[N-1] = min;
			a[N-3] = min;
			ans++;
		}

		for(int i = right;i >= 0;i--){			//左側
			if(a[i] != min){
				for(int j =i ; j > i-K+1;j--){
					if(j < 0){
						break;
					}
					a[j] = min;
				}
				ans++;
			}

		}
		for(int i = right;i < N ;i++){			//左側
			if(a[i] != min){
				for(int j =i ; j < i+K-1;j++){
					if(j >= N){
						break;
					}
					a[j] = min;
				}
				ans++;
			}

		}

		System.out.println(ans);


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



