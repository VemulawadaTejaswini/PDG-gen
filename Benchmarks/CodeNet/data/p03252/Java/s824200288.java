import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        if (S.length() != T.length()) {
            System.out.println("No");
        }

        char c1 = ' ';
        char c2 = ' ';
        for (int i = 0; i < S.length(); i++) {
            c1 = S.charAt(i);
            c2 = T.charAt(i);
            if (c1 != c2) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < S.length(); j++) {
                    if (S.charAt(j) == c1) {
                        sb.append(c2);
                    } else if (S.charAt(j) == c2) {
                        sb.append(c1);
                    } else {
                        sb.append(S.charAt(j));
                    }
                }
                S = sb.toString();
            }
        }

        if (S.equals(T)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
