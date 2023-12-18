import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        getX(0, r, d, x);
    }

    private static long getX(int depth, int r, int d, long x) {
        if (depth == 10) {
            return x;
        }
        depth++;
        System.out.println(r * x - d);
        return getX(depth, r, d, r * x - d);
    }
}