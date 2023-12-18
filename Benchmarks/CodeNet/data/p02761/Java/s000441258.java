import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[] s = new int[M];
        for (int i = 0; i < M; i++) {
            s[i] = -1;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            s[a-1] = b;
        }

        int initValue = (int) Math.pow(10, N-1);

        int min = Integer.MAX_VALUE;
        for (int i = initValue; i < 1000; i++) {
            String str = String.valueOf(i);
            boolean b = true;
            for (int j = 0; j < M; j++) {
                int c = Character.getNumericValue(str.charAt(j));
                if (s[j] != -1 && c != s[j]) b = false;
            }

            if (s[0] == -1) continue;

            if (b) {
                min = Math.min(min, i);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
