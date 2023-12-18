import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		System.out.println(has7(str) ? "Yes" : "No");
	}
	public static boolean has7(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '7')
				return true;
		}
		return false;
	}
}
