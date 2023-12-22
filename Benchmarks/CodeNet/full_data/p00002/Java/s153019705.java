import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		while ((s = br.readLine()) != null) {
			String[] lc = s.split(" ");
			int a = Integer.parseInt(lc[0]);
			int b = Integer.parseInt(lc[1]);
			
			System.out.println((int)Math.log10(a+b)+1);
		}

	}
}