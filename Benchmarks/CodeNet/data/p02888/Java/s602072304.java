import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++ ) {
                    if (ary[i] < (ary[j] + ary[k]) && ary[j] < (ary[i] + ary[k]) && ary[k] < (ary[i] + ary[j])) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}