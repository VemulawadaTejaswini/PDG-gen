import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
        int R, G, B, N;

        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        G = scanner.nextInt();
        B = scanner.nextInt();
        N = scanner.nextInt();
        scanner.close();

        int counter = 0;
        int value = 0;

        for (int r = 0; (R*r) <= N; r++) {
            value = R*r;
            if (value == N) {
                counter++;
                continue;
            }
            for (int g = 0; (G*g) <= N; g++) {
                value = R*r + G*g;
                if (value == N) {
                    counter++;
                    continue;
                }
                for (int b = 0; (B*b) <= N; b++) {
                    value = R*r + G*g + B*b;
                    if (value == N) {
                        counter++;
                    }
                }

            }
        }

        System.out.println(counter);
    } 
}