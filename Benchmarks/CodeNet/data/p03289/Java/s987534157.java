import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        boolean ret = true;

        if (S.charAt(0) != 'A') {
            ret = false;
        }

        int cCount = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') cCount++;
        }
        if (cCount != 1) ret = false;

        int upperCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) upperCount++;
        }
        if (upperCount != 2) ret = false;

        if (ret) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}