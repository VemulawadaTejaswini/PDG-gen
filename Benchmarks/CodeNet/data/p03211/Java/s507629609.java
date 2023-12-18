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

		String S = st.nextToken();

		int abs= 1000;
//		int A = -1;
		int p=3;
		for(int i=0;i<S.length()-(p-1);i++) {
			int x = parseInt(S.substring(i, i+p));
//				System.out.println(x);
			if(abs > Math.abs(753-x)) {
				abs = Math.abs(753-x);
			}

		}
		System.out.println(abs);


	}
}
