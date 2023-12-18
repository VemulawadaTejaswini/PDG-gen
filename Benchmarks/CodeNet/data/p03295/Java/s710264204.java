
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        Pair2[] pairs = new Pair2[m];
        for (int i = 0; i > m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            Pair2 p = new Pair2();
            p.from = a[i];
            p.end = b[i];
            pairs[i] = p;
        }
        Arrays.sort(pairs);

        int cnt = 0;
        int nowclear = 0;
        for (int i = 0 ; i < m ; i++) {
            int nowFrom = pairs[i].from;
            int nowEnd = pairs[i].end;
            if (nowclear < nowFrom) {
                cnt++;
                nowclear = nowEnd - 1;
            }
        }
        System.out.println(cnt);

    }



}

class Pair2 implements Comparable {
    int from;
    int end;

    @Override
    public int compareTo(Object other) {
        Pair2 otherpair = (Pair2) other;
        return end - otherpair.end;
    }
}