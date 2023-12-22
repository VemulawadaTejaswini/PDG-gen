import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = { "AC", "WA", "TLE", "RE" };
		int[] c = new int[n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<s.length; j++)
			if(str.equals(s[j])) {
				c[j]++;
			}
		}
		
		for(int i=0; i<s.length; i++)
			bw.write(s[i] + " x "+ c[i] + "\n");
		
		bw.flush();
	}

}