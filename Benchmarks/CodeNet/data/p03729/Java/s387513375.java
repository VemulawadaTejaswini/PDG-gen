
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	private BufferedReader br;
	private BufferedWriter bw;
	private StringTokenizer st;
	private String a;
	private String b;
	private String c;
	public static void main(String[] args) throws IOException {
		new Main().start();
	}

	void start() throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		
			a=st.nextToken();
			b=st.nextToken();
			c=st.nextToken();
		
			if((a.charAt(a.length()-1)==b.charAt(0))&&(b.charAt(b.length()-1)==c.charAt(0))){
				bw.write("YES");
			}
			else{
				bw.write("NO");
			}
			
		bw.flush();
		br.close();
		bw.close();
	}

}
