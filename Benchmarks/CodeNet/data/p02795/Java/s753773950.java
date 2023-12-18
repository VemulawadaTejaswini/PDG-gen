import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        final int N = Integer.parseInt(sc.next());
        sc.close();

        int sum = 0;
        int cnt = 0;
        while (sum<N) {
            if (H>=W) {
                sum += H;
                W--;
            } else {
                sum += W;
                H--;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}