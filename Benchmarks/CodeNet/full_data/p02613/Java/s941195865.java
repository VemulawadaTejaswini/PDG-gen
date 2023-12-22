import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] label = {"AC", "WA", "TLE", "RE"};
        int[] C = new int[4];
        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            int idx = -1;
            switch (s) {
                case "AC":
                    idx = 0;
                    break;
                case "WA":
                    idx = 1;
                    break;
                case "TLE":
                    idx = 2;
                    break;
                case "RE":
                    idx = 3;
                    break;
            }

            C[idx]++;
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(label[i] + " x " + C[i]);
        }
    }
}
