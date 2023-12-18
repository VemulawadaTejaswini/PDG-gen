import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = parseInt(st.nextToken());

		if(N ==1) {
			System.out.println("Hello World");
			return;
		}

		st = new StringTokenizer(br.readLine());
		int A = parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int B = parseInt(st.nextToken());


		System.out.println(A+B);


	}




}