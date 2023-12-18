import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] N = new String[n];
        for (int i = 0; i < n; i++)
            N[i] = scan.next();
        int m = scan.nextInt();
        String[] M = new String[m];
        for (int i = 0; i < m; i++)
            M[i] = scan.next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j< n; j++) {
                if (N[i].equals(N[j]))
                    sum++;
            }
            for (int j = 0; j < m; j++) {
                if (N[i].equals(M[j]))
                    sum--;
            }
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
   }
    public static void main(String[] args) {
        new Main().run();
    }
}
