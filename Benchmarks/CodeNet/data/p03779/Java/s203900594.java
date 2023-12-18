import java.util.Scanner;

public class Main {
    static long x;
    static int mod = 1000000007;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        int time = 1;
        while (x > 0) {
            x -= time;
            if (x - (time + 1) < 0) {
                time += x;
                break;
            }
            time++;
        }
        System.out.println(time);
    }
}
