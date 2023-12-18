import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String str;
		String[] spl = new String[100];
		String[] cp = new String[100];
		String ch = "";
		int count = 0;
		int i = 0;
		Scanner scan= new Scanner(System.in);

		str = scan.next();
		spl = str.split("");

		for(String s : spl) {
			cp[i] = s;
			i += 1;
		}
		for(int j = 0; j < str.length(); j++) {
			ch = cp[j];
			for(int k = 0;k < str.length(); k++) {
				if(ch == cp[k]) {
					count += 1;
				}
			}
		}
		if(count % 2 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}