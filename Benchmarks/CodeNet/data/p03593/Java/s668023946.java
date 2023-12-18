import java.io.*;
import java.util.*;

public class Main {
	public static boolean enoughTwos(int r, int amount) {
		return (r <= amount/2) && ((r % 2) == (amount % 2));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int counts[] = new int[26];
		for(int i = 0; i < h; i++) {
			String s = f.readLine();
			for(int j = 0; j < w; j++) {
				counts[s.charAt(j) - 'a']++;
			}
		}
		int residues[] = new int[4];
		for(int i = 0; i < 26; i++) {
			residues[counts[i] % 4]++;
		}
		boolean good = true;
		int oddCount = 0;
		if(h % 2 == 1) {
			oddCount++;
		}
		if(w % 2 == 1) {
			oddCount++;
		}
		if(oddCount == 0) {
			good = (residues[1] == 0) && (residues[2] == 0) && (residues[3] == 0);
		} else if(oddCount == 1) {
			if(h % 2 == 1) {
				good = (residues[1] == 0) && enoughTwos(residues[2], w) && (residues[3] == 0);
			} else {
				good = (residues[1] == 0) && enoughTwos(residues[2], h) && (residues[3] == 0);
			}
		} else if(oddCount == 2) {
			good = (residues[1] == 1) && enoughTwos(residues[2], h - 1 + w - 1) && (residues[3] == 0);
		}
		if(good) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
