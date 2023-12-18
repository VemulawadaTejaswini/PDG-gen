import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = stdIn.nextInt();
        }

        int counter = 0;
        int min = p[0];

        for (int i = 0; i < n; i++) {
            if (min >= p[i]) {
                counter++;
                min = p[i];
            }
        }

        System.out.println(counter);
    }
}
