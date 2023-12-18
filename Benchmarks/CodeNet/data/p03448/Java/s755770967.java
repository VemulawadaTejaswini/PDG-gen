import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();

        int cnt = 0;
        for (int i = 0; i < A + 1; i++) {
            for (int j = 0; j < B + 1; j++) {
                for (int k = 0; k < C + 1; k++) {
                    int total = 500*i+100*j+50*k;
                    if (total == X) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
