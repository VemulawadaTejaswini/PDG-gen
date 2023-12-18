import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i += 2) {
            ans.append(S.substring(i, i + 1));
        }

        System.out.println(ans);
	}
}
