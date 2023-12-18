import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int K = sc.nextInt();
            final int S = sc.nextInt();
            int count = 0;
            for (int X = 0; X <= K; X++) {
                for (int Y = 0; Y <= K; Y++) {
                    for (int Z = 0; Z <= K; Z++) {
                        if (X + Y + Z == S) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}