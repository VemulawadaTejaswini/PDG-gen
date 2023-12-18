import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextLine();
		}
		sc.close();

		//処理
		int[] commonchars = new int[26];
		Arrays.fill(commonchars, 0);
		for(int i = 0; i < s[0].length(); i++){
			commonchars[s[0].charAt(i) - 'a']++;
		}
		for(int i = 1; i < n; i++){
			String ts = s[i];
			int[] tempchars = new int[26];
			Arrays.fill(tempchars, 0);
			for(int j = 0; j < ts.length(); j++){
				tempchars[ts.charAt(j) - 'a']++;
			}
			for(int j = 0; j < 26; j++){
				commonchars[j] = Math.min(commonchars[j], tempchars[j]);
			}
		}

		//出力	
		for(int i = 0; i < 26; i++){
			int t = commonchars[i];
			for(int j = 0; j < t; j++){
				out.print((char)('a'+i));
			}
		}
		out.println();
		out.flush();
	}
}