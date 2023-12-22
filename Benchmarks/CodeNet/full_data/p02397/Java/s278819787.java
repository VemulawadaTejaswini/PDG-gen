import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 ** Constraint* *
		    0 ≤ x, y ≤ 10000
		 	the number of datasets ≤ 3000
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] streamLine;
		while (true) {
			streamLine = br.readLine().split(" ");
			if ( streamLine[0].equals("0") && streamLine[1].equals("0")) break;
			System.out.println(swap(streamLine[0], streamLine[1]));
		} 
	}
	public static String swap(String str1, String str2) {
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);

		if ( a <= b ) {
			return str1 + " " + str2; 
		}else {
			return str2 + " " + str1; 
		}

 	}
}
