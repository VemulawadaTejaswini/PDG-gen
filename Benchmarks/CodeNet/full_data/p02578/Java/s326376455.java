import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []A = new int[N+1];
		for(int i = 1; i<=N; i++) {
			A[i] = Integer.parseInt(st.nextToken());			
		}
		int stool = 0;
		for(int i = N; i>=1; i--) {
			while(A[i] > A[i-1]) {
				if(i == 1 || A[i-1] + stool >= A[i])break;
				stool++;
			}
		}
		System.out.println(stool);
	}
}