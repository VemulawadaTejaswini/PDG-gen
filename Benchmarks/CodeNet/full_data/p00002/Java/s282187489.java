import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer tk = new StringTokenizer(in.readLine());
			while(!tk.equals("EOF")) {
					int a = Integer.parseInt(tk.nextToken());
					int b = Integer.parseInt(tk.nextToken());
					System.out.println(((a + b) + "").length());
					tk = new StringTokenizer(in.readLine());
			}
	}
}