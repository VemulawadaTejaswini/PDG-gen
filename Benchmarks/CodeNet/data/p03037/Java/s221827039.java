import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] ary = new int[2];
        ary[0] = 1;
        ary[1] = n;
        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if (ary[0] < l) {
                ary[0] = l;
            }
            if (ary[1] > r) {
                ary[1] = r;
            }
        }
        System.out.println(ary[1] - ary[0] + 1);
    }
}