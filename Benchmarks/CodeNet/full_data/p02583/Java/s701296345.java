import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextLong());
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long a = l.get(i);
                    long b = l.get(j);
                    long c = l.get(k);
                    if(a != b && b != c && a != c) {
                        long sum = a + b + c;
                        long max = Math.max(a, Math.max(b, c));
                        if(max < sum - max ) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}