import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a = new int[n][26];
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				int d = s.charAt(j)-'a';
				a[i][d]++;
			}
		}
		for(int d=0; d<26; d++) {
			int cnt = 500;
			for(int i=0; i<n; i++) {
				cnt = Math.min(a[i][d], cnt);
			}
			for(int i=0; i<cnt; i++) {
				System.out.print(Character.toChars('a'+d));
			}
		}
		sc.close();
	}


}
