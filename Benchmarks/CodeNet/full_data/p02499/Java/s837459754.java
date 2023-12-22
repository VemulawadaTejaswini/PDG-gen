import java.io.*;
import java.util.*;
public class Main {
	
	// a : 49
	// z : 74
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int[] cnt = new int[26];
	public static char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
								'o','p','q','r','s','t','u','v','w','x','y','z'};
	public static boolean isStop = false;
	
	public static void cnt(String str) throws IOException {
		int index;
		if(str == null) {
			isStop = true;
			return;
		}
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			index = str.charAt(i) - '0';
			if (index - 49 < 0) continue;
			cnt[index - 49]++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			while (true) {
				String str = br.readLine();
				cnt(str);
				if(isStop) break;
			}
		} catch (EOFException e) {
		
		}
		for(int i = 0; i < cnt.length; i++)
			System.out.println(String.valueOf(c[i]) + " : " + cnt[i]);
	}

}