
import java.io.*;
import java.util.Arrays;

public class Main {

	//ツ　10011
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s1 = r.readLine();
		String s2 = r.readLine();
		String[] a = s2.split(" ");
		
		
		for(int i = 0; i < a.length; i++) {
			if (i != 0) 
				System.out.printf(" ");
			System.out.printf("%s", a[a.length - i - 1]);
		}
		System.out.printf("\n");
	}
}