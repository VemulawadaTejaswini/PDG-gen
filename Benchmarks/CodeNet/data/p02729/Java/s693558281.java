package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());

         int allPatternsNM = 0;
         allPatternsNM = (N + M)*(N + M -1)/2;
         int eachPatternsNM = N*M;
         int ans= allPatternsNM - eachPatternsNM;
         System.out.println(ans);

	}

}
