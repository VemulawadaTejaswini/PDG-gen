import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int difx = x[i] - x[j];
                int dify = y[i] - y[j];
                int tmp = 0;
                for (int k = 0; k < n; k++) {
                    for (int h = k + 1; h < n; h++) {
                        int sax = x[h] - x[k];
                        int say = y[h] - y[k];
                        if (Math.abs(difx) == Math.abs(sax) && Math.abs(dify) == Math.abs(say)) {
                            tmp++;
                        }
                    }

                }
                if (tmp > ans) {
                    ans = tmp;
                }
            }

        }
        ans = n - ans;
        if (n == 1) {
            ans = 1;
        }
        System.out.println(ans);
        sc.close();
    }
}
