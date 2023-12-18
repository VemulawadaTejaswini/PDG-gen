import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gate[] = new int[n + 2];
        Arrays.fill(gate, 0);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            gate[a]++;
            gate[b + 1]--;
        }
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < n + 2; i++) {
            cnt += gate[i];
            if (cnt == m) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}