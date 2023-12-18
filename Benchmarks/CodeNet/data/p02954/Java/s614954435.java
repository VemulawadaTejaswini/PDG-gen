import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        long[] Math = new long[S.length()];
        for (int i = 0; i < Math.length; i++) {
            Math[i] = 1;
        }
        boolean LR[] = new boolean[S.length()];
        for (int i = 0; i < LR.length; i++) {
            if (S.charAt(i) == 'L') {
                LR[i] = true;
            } else {
                LR[i] = false;
            }
        }

        //繰り返し 10^5回
        long[] MathBefore = new long[S.length()];
        long count = 0;
        while (true) {
            for (int i = 0; i < Math.length; i++) {
                MathBefore[i] = Math[i];
                Math[i] = 0;
            }

            for (int i = 0; i < MathBefore.length; i++) {
                if (LR[i]) {
                    Math[i - 1] += MathBefore[i];
                } else {
                    Math[i + 1] += MathBefore[i];
                }
            }
            if(count == 99999){
                break;
            }
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.length; i++) {
            long l = Math[i];
            sb.append(l).append(" ");
        }

        System.out.println(sb.toString());

        return;

    }
}
