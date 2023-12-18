
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j && i < 10) {
                    answer++;
//                    System.out.println("(" + i + "," + j + ")");
                    continue;
                }
                String sti = String.valueOf(i);
                String stj = String.valueOf(j);

                int iFirst = sti.charAt(0) - 48;
                int iLast = sti.charAt(sti.length() - 1) - 48;

                int jFirst = stj.charAt(0) - 48;
                int jLast = stj.charAt(stj.length() - 1) - 48;

                if (iFirst == jLast && iLast == jFirst) {
                    answer++;
//                    System.out.println("(" + i + "," + j + ")");
                    continue;
                }

            }
        }
        System.out.println(answer);
    }
}
