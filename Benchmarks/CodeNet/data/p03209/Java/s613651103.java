import static java.lang.Long.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long N;
	public static long X;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseLong(st.nextToken());
		X = parseLong(st.nextToken());


		String bg = "P";
		for(int i=1;i<=N;i++) {
			bg =String.format("B%sP%sB",bg,bg );

		}

		long ans = 0;
		for(int i =0;i<X;i++) {
			String s = bg.substring(0,1);
			if(s.equals("P")) {
				ans++;
			}
			bg = removeFirstChar(bg);
		}
		System.out.println(ans);

	}
	public static String removeFirstChar(String s){
		   return s.substring(1);
		}
}