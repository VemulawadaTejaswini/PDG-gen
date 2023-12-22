import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int lines = Integer.parseInt(sc.nextLine());
		for (int index = 0; index < lines; index++) {
			String line = sc.nextLine();
			String[] words = line.split(" ");
			
			int alpha = 0;
			int beta = 0;
			for (int i = 0; i < words.length; i++) {
				if (words[i].length() == 4) {
					int diff = words[i].charAt(3) - words[i].charAt(0);

					if (diff == 0) {
						beta = words[i].charAt(2) - 'a';
						diff = words[i].charAt(0) - words[i].charAt(1);
						
						int limit = 0;
						while ((diff % 12 != 0) || (diff <= 0)) {
							diff = diff + 26;
							
							limit++;
							if (limit == 12) break;
						}
						alpha = diff / 12;
						
						if (limit < 12) break;
					} else {
						diff = words[i].charAt(0) - words[i].charAt(1);
						
						int limit = 0;
						while ((diff % 12 != 0) || (diff <= 0)) {
							diff = diff + 26;
							limit++;
							if (limit == 12) break;
						}
						alpha = diff / 12;

						beta = words[i].charAt(0) - 'a' - alpha * 19;
						while (beta < 0) beta = beta + 26;
						
						if (limit < 12) break;
					}
				}
			}
			
			int[] ab = new int[26];
			for (int i = 0; i < 26; i++) {
				int tmp = (alpha * i + beta) % 26;
				ab[tmp] = i;
			}
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) != ' ') sb.append((char)(ab[line.charAt(i) - 'a'] + 'a'));
				else sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}