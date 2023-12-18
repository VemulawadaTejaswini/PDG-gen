import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String[] str = {"dream", "dreamer",  "eraser","erase"};
		String S;
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		S = S.replaceAll(" ","");

		for(int i = 0; i < str.length; i++) {
			if(S.endsWith(str[i])) {
				S = S.replace(str[i], "");
				S = S.replace(" ", "");
				i = -1;
			}
		}
		if(S.length() == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		scan.close();
	}
}
