import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] C = S.toCharArray();
        sc.close();

        String ans = "";
        int l = C.length;
        for (int i = 0; i < l; i += 2) {
            ans += String.valueOf(C[i]);
        }

        System.out.println(ans);
	}
}