import java.util.Scanner;
 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l[] = new int[m], r[] = new int[n];
        for (int i = 0; i < m; i++)
            l[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == l[i]) {
                    r[j]++;
                    s++;
                }
            }
            r[l[i] - 1] += n - s;
        }
        for (int i : r)
            System.out.println(i);
    }
}
