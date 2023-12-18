import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println( solve(a,b,c,d) );
    }

    private static String solve(int a, int b, int c, int d) {
        if( canTalk(a, b, d) && canTalk(b, c, d) || canTalk(a, c, d) ) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private static boolean canTalk(int x, int y, int d) {
        return Math.abs(x - y) <= d;
    }
}
