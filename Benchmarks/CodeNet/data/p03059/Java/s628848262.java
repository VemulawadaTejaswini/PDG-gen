import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        int cnt = 0;
        int time = 0;
        while (true) {
            time += A;
            if (time > T+0.5) {
                break;
            }
            cnt += B;
        }
        System.out.println(cnt);
    }
}
