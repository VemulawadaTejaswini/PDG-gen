import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		int k = Integer.parseInt(read(1)[0]);
		
		System.out.println(((k + 1) / 2) * (k / 2));
		
		close();
	}
	
	private static String[] read(int len) {
		List<String> strList = new ArrayList<>();
		
		try {
			if (br == null) {
				br = new BufferedReader(new InputStreamReader(System.in));
			}
			
			for (int i = 0; i < len; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
		
		return strList.toArray(new String[0]);
	}
	
	private static void close() {
		try {
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
		}
	}
}
