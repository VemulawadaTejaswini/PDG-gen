import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] S = sc.next().toCharArray();
        System.out.println(S[2] == S[3] && S[4] == S[5] ? "Yes" : "No");
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}
