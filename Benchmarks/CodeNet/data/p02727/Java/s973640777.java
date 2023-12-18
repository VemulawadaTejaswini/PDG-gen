import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Integer[] p = new Integer[A];
        Integer[] q = new Integer[B];
        Integer[] r = new Integer[C];
        for (int i = 0; i < A; i++) p[i] = sc.nextInt();
        for (int i = 0; i < B; i++) q[i] = sc.nextInt();
        for (int i = 0; i < C; i++) r[i] = sc.nextInt();

        Arrays.sort(p, Collections.reverseOrder());
        Arrays.sort(q, Collections.reverseOrder());
        Arrays.sort(r, Collections.reverseOrder());
        Integer[] eat = new Integer[X + Y];
        for (int i = 0; i < X; i++) {
            if (i < A) eat[i] = p[i];
            else eat[i] = 0;
        }
        for (int i = 0; i < Y; i++) {
            if (i < B) eat[i + X] = q[i];
            else eat[i + X] = 0;
        }
        Arrays.sort(eat);
        for (int i = 0; i < C; i++) {
            if (eat[0] >= r[i]) break;
            eat[0] = r[i];
            Arrays.sort(eat);
        }
        int ans = 0;
        for (Integer i : eat) ans+=i;
        System.out.println(ans);
    }
}
