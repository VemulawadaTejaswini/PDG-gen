import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String[] strs = read(3);
		int n = Integer.parseInt(strs[0]);
		String[] vs = strs[1].split(" ");
		String[] cs = strs[2].split(" ");

		int max = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(vs[i]) - Integer.parseInt(cs[i]);
			if (a > 0) {
				max += a;
			}
		}

		System.out.println(max);
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
