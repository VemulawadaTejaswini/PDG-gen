import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String words[] = new String[n];
		for(int i= 0; i < n; i++) {
			words[i] = scan.next();
		}
		scan.close();
		String endWord = words[0].substring(words[0].length()-1, words[0].length());
		for(int i = 1; i< n;i++) {
			String startWord = words[i].substring(0, 1);
			if(endWord.equals(startWord)) {
				endWord =  words[i].substring(words[i].length()-1, words[i].length());
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
