import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        int o = 0;
        int l = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0') {
                o++;
            } else {
                l++;
            }
        }

        System.out.println(Math.min(o, l) * 2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().main(sc);
        } catch (Exception e) {
            throw e;
        }
    }
}
