import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        long count = 0;
        int p = 2019;

        int[] place = new int[p - 1];
        place[0] = 1;
        for (int i = 1; i < p - 1; i++) {
            place[i] = place[i - 1] * 10 % p;
        }

        int[] r = new int[p];
        r[0] = 1;
        int remain = 0;
        for (int i = 0; i < N; i++) {
            remain += (S.charAt(N - 1 - i) - 48) * place[i % (p - 1)];
            remain %= p;
            r[remain]++;
        }

        for (int i = 0; i < p; i++)
            count += (long) r[i] * (r[i] - 1) / 2;

        System.out.println(count);
    }

}