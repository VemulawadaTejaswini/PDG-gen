import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int x = 0;
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c=='I'){
				x++;
			}else if (c=='D') {
				x--;
			}
			max = Math.max(x, max);
		}
		System.out.println(max);
	}
}
