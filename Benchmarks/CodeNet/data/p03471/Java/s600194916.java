import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long Y = sc.nextLong();

        for (int i = 0; i < N + 1; i++) { // 10,000
            for (int j = 0; j < N + 1 - i; j++) { // 5,000
                int k = N - i - j;
                if (k < 0) continue;
                long sum = ((long)i * 10000l) + ((long)j * 5000l) + ((long)k * 1000l);
                if (sum == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}