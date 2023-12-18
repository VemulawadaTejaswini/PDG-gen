import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		StringTokenizer st;
		int a,b;
		for (String line; (line = in.readLine())!=null;) {
			st = new StringTokenizer(line);

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			if((a<0&&b>0)||(a==0||b==0)){
				out.println("Zero");
			}else if((a>0&&b>0)||(Math.abs(Math.abs(a)-Math.abs(a))%2!=0)){
				out.println("Positive");
			}else{
				out.println("Negative");
			}

		}

		out.close();
		in.close();
	}
}
