import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());

        long ans = N * (long)Math.pow(100,D);
        System.out.println(ans);

    }
}