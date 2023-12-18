import java.util.Scanner;

class NumTh{
	static long mod=1000000007; // 10e9 + 7
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] Left = new int[N];
			int[] Right = new int[N];
			for(int i = 0; i < N; i++) A[i] = sc.nextInt();
			// Left
			Left[0] = A[0];
			for(int i = 1; i < N; i++) Left[i] = NumTh.GCD(A[i], Left[i - 1]);
			// Right
			Right[N - 1] = A[N - 1];
			for(int i = N - 2; i >= 0; i--) Right[i] = NumTh.GCD(A[i], Right[i + 1]);
			int ans = 0;
			for(int i = 0; i < N; i++) {
				int tmp = 0;
				if(i == 0) tmp = Right[i + 1];
				else if(i == N - 1) tmp = Left[i - 1];
				else tmp = NumTh.GCD(Right[i + 1], Left[i - 1]);
				ans = Math.max(ans, tmp);
			}
			System.out.println(ans);
		}
	}
}