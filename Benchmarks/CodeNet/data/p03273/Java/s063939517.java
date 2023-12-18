import java.io.*;
import java.util.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String[] strs = read(1)[0].split(" ");
		
		int h = Integer.parseInt(strs[0]);
		int w = Integer.parseInt(strs[1]);
		char[] empty = new char[w];
		for (int i = 0; i < w; i++) {
			empty[i] = ' ';
		}
		
		strs = read(h);
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			String tmp = strs[i];
			for (int j = 0; j < w; j++) {
				a[i][j] = tmp.charAt(j);
			}
		}
		
		char[][] a2 = new char[h][w];
		for (int i = 0; i < h; i++) {
			String str = new String(a[i]);
			if (str.replace("#", "").trim().length() == 0 || str.replace(".", "").trim().length() == 0) {
				a2[i] = empty;
			} else {
				a2[i] = a[i];
			}
		}
		
		for (int i = 0; i < w; i++) {
			StringBuilder strB = new StringBuilder();
			
			for (int j = 0; j < h; j++) {
				strB.append(a[j][i]);
			}
			
			String str = strB.toString();
			if (str.replace("#", "").trim().length() == 0 || str.replace(".", "").trim().length() == 0) {
				for (int j = 0; j < h; j++) {
					a2[j][i] = ' ';
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a2[i][j] != ' ') {
					System.out.print(a2[i][j]);
				}
			}
			
			if (new String(a2[i]).trim().length() > 0) {
				System.out.println();
}
		}
		
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
