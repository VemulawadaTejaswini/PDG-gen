import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int i1 = Integer.parseInt(st.nextToken()), i2 = Integer.parseInt(st.nextToken());
		int p = i1 + i2, m = i1 * i2, s = i1 - i2;
		System.out.println(Math.max(Math.max(p, m), s));
	
		
	}
	
}


