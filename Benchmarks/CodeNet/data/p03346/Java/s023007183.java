import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int maxOverPerf = 0;
        for (int i = 0; i < n; i++) {
            int p = cin.nextInt();
            if (p < i + 1) maxOverPerf = Math.max(maxOverPerf, p);
        }
        System.out.println(maxOverPerf);
    }
}
