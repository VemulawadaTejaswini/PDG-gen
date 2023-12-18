import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abx = sc.nextLine().split(" ");
        long a = Long.parseLong(abx[0]);
        long b = Long.parseLong(abx[1]);
        long x = Long.parseLong(abx[2]);

        long ans = 0;
        for (; a <= b; a++) {
            if (a % x == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
