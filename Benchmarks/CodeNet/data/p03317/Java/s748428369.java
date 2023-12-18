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
		for(int i = 0;i < N;i++){
			if(a[i] != min){
				int c = 0;
				for(int j = i;j < i+K;j++){
					if(j >= N){
						break;
					}
					if(c >= K-1){
						break;
					}
					if(a[j] != min){
						c++;
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



