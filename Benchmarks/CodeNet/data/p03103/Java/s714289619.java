import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		sc.close();
		Data[] d = new Data[N];
		for(int i = 0; i < N; i++) {
			d[i] = new Data(A[i], B[i]);
		}
		Arrays.sort(d, new MyComp());
		long ans = 0;
		long res = M;
		for(int i = 0; i < N; i++) {
			if(res - d[i].b <= 0) {
				ans += d[i].a * res;
				break;
			}else {
				ans += d[i].b * d[i].a;
				res -= d[i].b;
			}
		}
		System.out.println(ans);

	}
	static class Data{
		long a, b;
		Data(long a, long b){
			this.a = a;
			this.b = b;
		}
	}
	static class MyComp implements Comparator<Data>{
		public int compare(Data d1, Data d2) {
			if(d1.a < d2.a) {
				return -1;
			}else if(d1.a == d2.a) {
				return 0;
			}else {
				return 1;
			}
		}
	}
}
