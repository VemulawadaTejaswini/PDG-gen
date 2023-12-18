import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        long sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S[i] != S[j]) {
                    for (int k = j + 1; k < N; k++) {
                        if (S[i] != S[k] && S[j] != S[k] && (j - i) != (k - j)) {
                            sum++;
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }
}