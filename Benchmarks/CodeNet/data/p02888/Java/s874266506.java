import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    static Scanner sc;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        sort(l);
        int ans = 0;
        for (int a = 0; a < n; a++) {
            for (int b = a+1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    if(l[c] >= l[a] + l[b]) break;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

