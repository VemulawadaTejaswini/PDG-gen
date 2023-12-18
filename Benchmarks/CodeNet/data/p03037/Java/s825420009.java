import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int l = 0;
        int r = N;
        int[] cnt = new int[N];
        int ans = 0;
        for (int i = 0; i < M; i++) {
            l = Math.max(l, scanner.nextInt());
            r = Math.min(r, scanner.nextInt());
        }
        System.out.println(r - l >= 0 ? r - l + 1 : 0);
    }

}
