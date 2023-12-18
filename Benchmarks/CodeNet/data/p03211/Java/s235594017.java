import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int num = 0;
        int diff = 11111;
        int abs = 0;
        int tmpDiff = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            num = Integer.valueOf(S.substring(i, i + 3));
            tmpDiff = Math.max(num, 753) - Math.min(num, 753);
            diff = Math.min(diff, tmpDiff);
        }

        System.out.println(diff);
    }
}


