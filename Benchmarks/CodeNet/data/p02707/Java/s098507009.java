import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sub = new int[N+1];
		for(int i=1; i<N+1; i++)
			sub[A[i]]++;
		for(int i=1; i<N+1; i++) {
			bw.write(sub[i] + "\n");
		}
		
		bw.flush();
    }
}