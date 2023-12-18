import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String S = input.next();
        char rgb[] = S.toCharArray();
        long sum = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if ((rgb[i] != rgb[j]) && (rgb[j] != rgb[k]) && (rgb[k] != rgb[i])) {
                        if ((j - i) != (k - j)) {
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}