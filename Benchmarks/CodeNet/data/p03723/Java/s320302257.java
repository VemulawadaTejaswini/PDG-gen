
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
	private int a;
	private int b;
	private int c;
	private int newa;
	private int newb;
	private int newc;
	private int count;

	public static void main(String[] args) throws IOException {
		new Main().start();
	}

	void start() throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		
			newa = a;
			newb = b;
			newc = c;
			count = 0;
			while (newa % 2 == 0 && newb % 2 == 0 && newc % 2 == 0) {
				newa = b / 2 + c / 2;
				newb = a / 2 + c / 2;
				newc = a / 2 + b / 2;
				if((newa==b/2+c/2)&&(newb==a/2+c/2)&&(newc==a/2+b/2)){
					count=-1;
					break;
				}
				a = newa;
				b = newb;
				c = newc;
				count++;
			
		}
		bw.write(count + "");
		bw.flush();
		br.close();
		bw.close();

	}

}
