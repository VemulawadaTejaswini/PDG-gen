import java.io.*;
//import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] cnt = new int[75];
		String s = br.readLine().toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' < 0) continue;
			cnt[s.charAt(i) - '0']++;
		}
		for (int i = 49; i <= 74; i++)
			System.out.println(c[i - 49] + "  : " + cnt[i]);
		System.out.println();
	}
	
}