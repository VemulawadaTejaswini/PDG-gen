import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        int len = s.length;

        System.out.println((len % 2 == 1) ^ (s[0] == s[len - 1]) ? "First" : "Second");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
