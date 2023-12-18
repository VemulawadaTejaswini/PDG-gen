import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S1 = scanner.next();
        String S2 = S1;
        int S1_l= S1.length();
        int S2_l= S2.length();

        S2.length();

        String T1 = "01";
        String T2 = "10";

        int R1_count = 0;
        int R2_count = 0;
        Integer tmp1 = 0;
        Integer tmp2 = 0;
        while(true) {
            tmp1 = S1.length();
            tmp2 = S2.length();
            S1 = S1.replace(T1, "");
            S2 = S2.replace(T2, "");
            if(S1.length() == tmp1 && S2.length() == tmp2) break;
        }

        Integer max = Math.max(S1_l-tmp1, S2_l-tmp2);
        System.out.println(max);

    }
}
