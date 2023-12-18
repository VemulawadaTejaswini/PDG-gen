import java.util.Arrays;
import java.util.Scanner;

class Main{

	static long[] a;
	static	int N ;
	static	int M ;


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		long ans = 0;
		a = new long[N];

		//int[] data = new int[Integer.MAX_VALUE];
		//M = scanner.nextInt();
		for(int i = 0;i < N;i++){
			a[i] = scanner.nextLong();
		}
		Arrays.sort(a);

		long k = a[0];					//現在の数値
		int c = 1;						//現在の数値の個数

		for(int i = 1;i < N;i++){


			if(a[i] != k){
				if(c < k){
					ans += c;
				}else{
					ans += c -k;
				}
				c = 1;
				k =a[i]; 

			}else{
				c++;
			}
		}
		
		if(c < k){
			ans += c;
		}else{
			ans += c -k;
		}

		System.out.println(ans);
	}


}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



