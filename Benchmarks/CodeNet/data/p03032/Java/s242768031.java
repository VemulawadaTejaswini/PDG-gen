import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] V = new int[N];
		long[] Vl = new long[N+1];
		long[] Vr = new long[N+1];
		long ans = 0;
		for(int i = 0; i < N; i++)
			V[i] = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			Vl[i] = Vl[i-1];
			Vl[i] += V[i-1];
		}
		for(int i = 1; i <= N; i++) {
			Vr[i] = Vr[i-1];
			Vr[i] += V[N-i];
		}
		for(int i = 0; i <= K && i <= N; i++) {
			for(int j = 0; j <= K-i && j <= N-i; j++){
				long value = Vl[i] + Vr[j];
				List<Integer> Vsorted = new ArrayList<>();
				for(int k = 0; k < i; k++)
					Vsorted.add(V[k]);
				for(int k = N-1; k >= N-j; k--)
					Vsorted.add(V[k]);
				Collections.sort(Vsorted);
				for(int k = 0; k < K-i-j; k++) {
					if(k >= Vsorted.size())
						break;
					if(Vsorted.get(k) < 0)
						value -= Vsorted.get(k);
					else
						break;
				}
				ans = Math.max(ans, value);
			}
		}
		System.out.println(ans);
	}

}
