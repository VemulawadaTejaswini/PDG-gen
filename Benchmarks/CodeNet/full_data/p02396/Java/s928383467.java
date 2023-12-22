import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 ** Constraint* *
		    1 ≤ x ≤ 10000
		 	The number of datasets ≤ 10000
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String streamLine;
		for (int i = 1;  ; i++) {
			streamLine = br.readLine();
			if ( streamLine.equals("0")) break;
			System.out.println("Case " + i + ": " + streamLine);
		} 
	}
}
