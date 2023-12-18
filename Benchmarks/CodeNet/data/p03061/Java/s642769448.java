import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int N = std.nextInt();
        List<Integer> s = IntStream.range(0, N).map(it -> std.nextInt()).boxed().collect(Collectors.toList());
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            List<Integer> copy = new ArrayList<>(s);
            copy.remove(i);
            int gcd = 0;
            int first = copy.get(0);
            int size = (copy.size() > 1) ? 2 : copy.size();
            for (int j = 0; j < size; j ++) {
                if (gcd != 0) {
                    gcd = gcd(copy.get(j), gcd);
                } else {
                    gcd = gcd(copy.get(j), first);
                }
            }

            if (max < gcd) {
                max = gcd;
            }
        }

        System.out.println(max);
    }

    static int gcd(int l, int r) {
        if (l < r) {
            int right = l;
            l = r;
            r = right;
        }

        if (r == 0) {
            return l;
        }

        return gcd(r, l % r);
    }
}
