import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S;
	int[] lefts, rights;
	int result = Integer.MAX_VALUE;
	
	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		N = Integer.parseInt(in.readLine());
		S = in.readLine();
		in.close();
		this.lefts = new int[2];
		this.rights = new int[2];
		init();
		calc();
	}
	
	void init() {
		this.lefts[0] = 0;
		this.lefts[1] = 0;
		this.rights[0] = 0;
		this.rights[1] = 0;
		for(int i = 0; i < S.length(); ++i) {
			if(S.charAt(i) == '#') {
				++rights[1];
			}else {
				++rights[0];
			}
		}
	}

	void calc() {
		this.result = this.rights[0];
		for(int i = 0; i < S.length(); ++i) {
			if(S.charAt(i) == '#') {
				--rights[1];
				++lefts[1];
			}else {
				--rights[0];
				++lefts[0];
			}
			this.result = Math.min(result, rights[0] + lefts[1]);
		}
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);

	}

}