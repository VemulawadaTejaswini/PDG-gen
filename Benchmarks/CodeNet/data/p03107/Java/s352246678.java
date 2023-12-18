import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S1 = scanner.next();
        String S2 = S1;

        Integer[] choice1 = new Integer[S1.length()];
        Integer[] choice2 = new Integer[S1.length()];
        String T1 = "01";
        String T2 = "10";

        int R1_count = 0;
        int R2_count = 0;
        while(true) {
            int R1= S1.indexOf(T1,0);
            int R2= S2.indexOf(T2,0);

            if(0 <= R1) {
                int tmp = S1.length();
                S1 = S1.replace(T1, "");
                R1_count += tmp - S1.length();
            }

            if(0 <= R2) {
                int tmp = S2.length();
                S2 = S2.replace(T2, "");
                R2_count += tmp - S2.length();
            }
            if(R1 == -1 && R2 == -1) break;
        }

        Integer max = Math.max(R1_count, R2_count);
        System.out.println(max);

    }
}
