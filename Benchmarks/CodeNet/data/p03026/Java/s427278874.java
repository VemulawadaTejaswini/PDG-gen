import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		int[] acopy = new int[N-1];
		int[] bcopy = new int[N-1];
		int[] c = new int[N];
		int[][] edge = new int[N][2];
		int[] num = new int[N];
		long ans = 0;
		for(int i = 0; i < N-1; i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
			acopy[i] = a[i];
			bcopy[i] = b[i];
			edge[a[i]][1]++;
			edge[b[i]][1]++;
		}
		for(int i = 0; i < N; i++)
			edge[i][0] = i;
		Arrays.sort(edge, (x,y) -> x[1] - y[1]);
		for(int i = 0; i < N; i++)
			c[i] = sc.nextInt();
		Arrays.sort(c);
		List<Integer> sorted = new ArrayList<>();
		sorted.add(edge[N-1][0]);
		for(int i = 0; i < N; i++) {
			int key = sorted.get(i);
			for(int j = 0; j < N-1; j++) {
				if(acopy[j] == key) {
					sorted.add(b[j]);
					acopy[j] = -1;
					bcopy[j] = -1;
				}
				if(bcopy[j] == key) {
					sorted.add(a[j]);
					acopy[j] = -1;
					bcopy[j] = -1;
				}
			}
			if(sorted.size() >= N)
				break;
		}
		for(int i = N-1; i >= 0; i--)
			num[sorted.get(N-1-i)] = c[i];
		for(int i = 0; i < N-1; i++)
			ans += Math.min(num[a[i]], num[b[i]]);
		System.out.println(ans);
		for(int i = 0; i < N; i++)
			System.out.println(num[i]);
	}

}
