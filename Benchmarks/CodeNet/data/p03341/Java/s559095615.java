import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char s[] = sc.next().toCharArray();
        sc.close();
        int e[] = new int[n];
        int w[] = new int[n + 1];
        w[0] = 0;
        if (s[0] == 'E') {
            e[0] = 1;
            w[1] = 0;
        } else {
            e[0] = 0;
            w[1] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (s[i] == 'E') {
                e[i] = e[i - 1] + 1;
                w[i + 1] = w[i];
            } else {
                e[i] = e[i - 1];
                w[i + 1] = w[i] + 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > e[n - 1] - e[i] + w[i])
                min = e[n - 1] - e[i] + w[i];
        }
        System.out.println(min);
    }
}