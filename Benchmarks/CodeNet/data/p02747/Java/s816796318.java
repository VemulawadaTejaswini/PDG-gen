import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        boolean ish = false;
        boolean isi = false;
        for (char c : s.toCharArray()) {
            if (!ish && !isi && c == 'h') {
                ish = true;
            } else if (ish && !isi && c == 'i') {
                isi = true;
            } else if (ish && isi && c != 'i') {
                System.out.println("Yes");
                System.exit(0);
            } else {
                ish = false;
                isi = false;
            }
        }

        if (ish && isi) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}