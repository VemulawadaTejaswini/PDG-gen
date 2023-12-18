import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int c = Math.min(n, k);
        int max = -100000000;
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= c; j++) {
                if (i + j <= c) {
                    List<Integer> list = new ArrayList<>();
                    int sum = 0;
                    for (int l = 0; l < i; l++) {
                        list.add(v[l]);
                        sum += v[l];
                    }
                    for (int r = 0; r < j; r++) {
                        list.add(v[n - 1 - r]);
                        sum += v[n - 1 - r];
                    }
                    Collections.sort(list);
                    for (int m = 0; m < Math.min(i + j, c - i - j); m++) {

                        if (list.get(m) < 0) {
                            sum -= list.get(m);
                        }
                    }

                    max = Math.max(max, sum);
                }

            }
        }
        System.out.println(max);

    }

}