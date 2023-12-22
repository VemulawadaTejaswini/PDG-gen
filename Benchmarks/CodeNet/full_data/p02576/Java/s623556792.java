import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int tmps = n / x;
        int tmpa = n % x;
        if (tmpa == 0) {
            System.out.println(tmps * t);
        } else {
            System.out.println((tmps + 1) * t);
        }
    }
}
