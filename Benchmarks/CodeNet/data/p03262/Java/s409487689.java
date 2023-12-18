import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;i++){
			x[i] = sc.nextInt();
		}
		if(N == 1){
			System.out.println(Math.abs(x[0]-X));
			return;
		}
		
		Arrays.sort(x);
		int[] dis = new int[N-1];
		for(int i = 1;i < N;i++){
			dis[i-1] = x[i] - x[i-1];
		}
		int[] yakusuu = new int[N-2];
		for(int i = 0;i < N-2;i++){
			yakusuu[i] =(int)gcd(dis[i], dis[i+1]);
		}
		
		System.out.println(yakusuu[N-3]);
		
	}

	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
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

