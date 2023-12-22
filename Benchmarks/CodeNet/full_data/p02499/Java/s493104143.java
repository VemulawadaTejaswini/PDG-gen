import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int count[] = new int[26];
		for (int i = 0; i < 26; i++){count[i] = 0;}
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) - 'a' >= 0 && 'z' - str.charAt(i) >= 0){
				count[str.charAt(i) - 'a']++;
			}
		}
		for (int i = 0; i < 25; i++){
			System.out.printf("%c : %d\n", 'a' + i, count[i]);
		}
		System.out.printf("%c : %d", 'a' + 25, count[25]);
	}
}