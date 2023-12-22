import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int alphabet[];
		alphabet = new int[26];
		for(int i = 0;i < 26; i++) {
			alphabet[i] = 0;
		}
		while(sc.hasNext()) {
			String str = sc.next();
			str = str.toLowerCase();
			for(int i = 0;i < str.length();i++) {
				if(97 <= str.charAt(i) && str.charAt(i) <= 122) alphabet[str.charAt(i) - 97]++;
			}
		}
		for(int i = 0;i < 26;i++) {
			System.out.printf("%c : %d\n",i + 97,alphabet[i]);
		}
		sc.close();
	}
}
