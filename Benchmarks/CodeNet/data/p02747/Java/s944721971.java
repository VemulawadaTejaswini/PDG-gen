import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] S = sc.next().toCharArray();
        boolean success = S.length % 2 == 0;
        for (int i = 0; i < S.length && success; i += 2)
            success = (S[i] == 'h' && S[i + 1] == 'i');
        System.out.println(success ? "Yes" : "No");
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
