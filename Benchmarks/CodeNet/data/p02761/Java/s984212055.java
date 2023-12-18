import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] ans = new int[N];

        for (int i = 0; i < M; i++) {
            int p = sc.nextInt() - 1;
            int a = sc.nextInt();

            if (ans[p] == 0) {
                ans[p] = a;
            } else if (ans[p] != a) {
                System.out.println("-1");
                System.exit(0);
            } else { }
            if (p == 0 && a == 0) {
                System.out.println("-1");
                System.exit(0);
            }
            sc.nextLine();
        }

        int s = 1;
        int a = 0;
        if (ans[0] == 0) { ans[0] = 1;}
        for (int i = N-1; i >= 0; i--) {
            a += ans[i] * s;
            s *= 10;
        }

        System.out.println(a);
    }
}