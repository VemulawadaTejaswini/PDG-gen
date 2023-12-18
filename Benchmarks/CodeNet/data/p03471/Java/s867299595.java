import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                int k = N - i - j;
                int y = i * 10000 + j * 5000 + k * 1000;
                if (Y == y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}