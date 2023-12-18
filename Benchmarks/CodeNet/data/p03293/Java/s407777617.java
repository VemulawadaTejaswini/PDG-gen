import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        int n = s.length;

        for (int i = 0; i < n; i++) {
            if (s[0] == t[i]) {
                boolean isOk = true;
                for (int j = 0; j < n; j++) {
                    if (s[j] != t[(i + j) % n]) {
                        isOk = false;
                        break;
                    }
                }

                if (isOk) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
