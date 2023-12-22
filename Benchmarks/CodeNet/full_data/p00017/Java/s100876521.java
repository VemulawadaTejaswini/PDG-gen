import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String[] strtest = new String[26 * 3];
		String[] ts = {"the", "this", "that"};
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 3; j++) {
				strtest[i * 3 + j] = "";
				for (int k = 0; k < ts[j].length(); k++) {
					char tmp = (char)((ts[j].charAt(k) + i - 'a') % 26);
					strtest[i * 3 + j] = strtest[i * 3 + j] + (char)(tmp + 'a');
				}
			}
		}
		
		String str = "";
		String ans = "";
		while (sc.hasNextLine() == true) {
			str = sc.nextLine();
			String[] words = str.split(" ");
			
			int d = 0;
			boolean flag = false;
			for (int i = 0; i < words.length; i++) {
				String tmp = words[i];
				if ((tmp.length() != 3) && (tmp.length() != 4)) continue;
				
				for (int j = 0; j < strtest.length; j++) {
					if (i == (words.length - 1)) {
						tmp.substring(0, (tmp.length() - 1));
					}
					
					if (tmp.equals(strtest[j])) {
						d = j / 3;
						flag = true;
						break;
					}
				}
				if (flag) break;
			}

			for (int i = 0; i < str.length(); i++) {
				if ((str.charAt(i) != ' ') && (str.charAt(i) != '.')) {
					int tmp = (char)((str.charAt(i) - d - 'a') % 26);
					ans = ans + (char)(tmp + 'a');
				} else {
					ans = ans + str.charAt(i);
				}
			}
			System.out.println(ans);
		}
	}
}