package d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String line = f.readLine();
		int R_num = 0;
		for(char character: line.toCharArray()) {
			if(character  == 'R') {
				R_num++;
			}else if(character  == 'S') {
				R_num = 0;
			}
		}
		out.print(R_num);
		out.close();
	}
}
