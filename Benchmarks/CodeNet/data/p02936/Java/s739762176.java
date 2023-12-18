import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = bf.readLine().split(" ");
		int N = Integer.parseInt(s1[0]);
		int Q = Integer.parseInt(s1[1]);
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		for(int i = 0;i< N-1;i++) {
			String[] s2 = bf.readLine().split(" ");
			a[i] = Integer.parseInt(s2[0]);
			b[i] = Integer.parseInt(s2[1]);
		}
		int[] p = new int[N];
		int[] x = new int[N];
		for(int i = 0;i< N;i++) {
			String[] s3 = bf.readLine().split(" ");
			p[i] = Integer.parseInt(s3[0]);
			x[i] = Integer.parseInt(s3[1]);
		}

		int[] cnt = new int[N];
		Arrays.fill(cnt, 0);
		for(int i = 0;i < N;i++) {
			cnt[p[i]] += x[i];
		}
		for(int i = 2;i < N;i++) {
			cnt[i] += cnt[i-1];
		}
		for(int i : cnt) {
			System.out.print(i + " ");
		}

	}

}