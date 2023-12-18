

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] p = IntStream.range(0, sc.nextInt()).map(e -> sc.nextInt()).toArray();
        int temp = p[0];
        int ans = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] <= temp) {
                ans++;
                temp = p[i];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}