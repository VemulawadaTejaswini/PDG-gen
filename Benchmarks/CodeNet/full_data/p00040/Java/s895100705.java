import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		char[] ab = new char[26];
		
		int lines = Integer.parseInt(sc.nextLine());
		for (int index = 0; index < lines; index++) {
			String line = sc.nextLine();
			String[] words = line.split(" ");
			
			int alpha = 0;
			int beta = 0;
			for (int i = 0; i < words.length; i++) {
				if (words[i].length() == 4) {
					int diff = words[i].charAt(3) - words[i].charAt(0);

					int limit = 0;
					if (diff == 0) {
						beta = words[i].charAt(2) - 'a';
						diff = words[i].charAt(0) - words[i].charAt(1);
						
						while ((diff % 12 != 0) || (diff <= 0)) {
							diff = diff + 26;
							
							limit++;
							if (limit == 12) break;
						}
						alpha = diff / 12;
					} else {
						diff = words[i].charAt(0) - words[i].charAt(1);
						
						while ((diff % 12 != 0) || (diff <= 0)) {
							diff = diff + 26;
							limit++;
							if (limit == 12) break;
						}
						alpha = diff / 12;

						beta = words[i].charAt(0) - 'a' - alpha * 19;
						while (beta < 0) beta = beta + 26;
					}
					if (limit == 12) continue;
					
					for (int j = 0; j < 26; j++) {
						int tmp = (alpha * j + beta) % 26;
						ab[tmp] = (char)(j + 'a');
					}
					
					String check = "";
					for (int j = 0; j < 2; j++) {
						check = check + ab[words[i].charAt(j) - 'a'];
					}
					if (check.equals("th")) break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) != ' ') sb.append((char)(ab[line.charAt(i) - 'a']));
				else sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}