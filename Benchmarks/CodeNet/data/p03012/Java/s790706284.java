import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w[] = new int[n];
        int wa = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            wa += w[i];
        }
        int s1 = 0;
        int ans = wa;
        for (int i = 0; i < n; i++) {
            s1 += w[i];
            wa -= w[i];
            if (Math.abs(s1 - wa) < ans) {
                ans = Math.abs(s1 - wa);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}