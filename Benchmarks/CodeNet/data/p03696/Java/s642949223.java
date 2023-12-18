import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int head = (s.charAt(0) == ')') ? 1 : 0;
        int foot = (s.charAt(n - 1) == '(') ? 1 : 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == ')' && s.charAt(i + 1) == ')') {
                head++;
            }
            if (s.charAt(i) == '(' && s.charAt(i + 1) == '(') {
                foot++;
            }
        }

        for (int i = 0; i < head; i++) {
            System.out.print("(");
        }
        System.out.print(s);
        for (int i = 0; i < foot; i++) {
            System.out.print(")");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
