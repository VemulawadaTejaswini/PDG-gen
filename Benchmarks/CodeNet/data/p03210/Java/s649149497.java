import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int X = parseInt(st.nextToken());

		if(X == 7 || X==5|| X==3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
