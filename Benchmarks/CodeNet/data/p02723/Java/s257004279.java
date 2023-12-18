import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		
		System.out.println((s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) ? "Yes": "No");
	}
}
