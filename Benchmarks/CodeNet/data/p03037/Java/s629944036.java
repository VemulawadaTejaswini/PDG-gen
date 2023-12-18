import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);

            int maxL = 0;
            int minR = N;
            for (int i = 0; i < M; ++i) {
                array = scanner.nextLine().split(" ");
                int L = Integer.parseInt(array[0]);
                int R = Integer.parseInt(array[1]);
                if (L > maxL) {
                    maxL = L;
                }
                if (R < minR) {
                    minR = R;
                }
            }
            if (minR >= maxL) {
                System.out.println(minR - maxL + 1);
            } else {
                System.out.println(0);
            }
        }
    }
}