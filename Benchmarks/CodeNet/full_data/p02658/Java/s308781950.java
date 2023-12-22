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
		
		int n = Integer.parseInt(br.readLine());
		
		long[] a = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<a.length; i++)
			a[i] = Long.parseLong(st.nextToken());
		
		long multi = 1;
		for(int i=0; i<a.length; i++) {
			multi *= a[i];
		}
		
		if(multi > (int)Math.pow(10, 18))
			bw.write(-1 + "\n");
		else
			bw.write(multi + "\n");
		bw.flush();
	}

}