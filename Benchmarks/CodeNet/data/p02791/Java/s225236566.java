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
        boolean count;

        for (int i = 0; i < n; i++) {
            count = true;
            for (int j = i; j >= 0; j--) {
                if (p[i] > p[j]) {
                    count = false;
                    break;
                }
            }
            if (count) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
