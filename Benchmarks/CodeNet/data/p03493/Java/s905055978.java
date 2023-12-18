import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ans = 0;

        for (int i=0; i<3; i++) {
            ans += (s % 10);
            s /= 10;
        }

        System.out.printf("%d\n", ans);
    }
}