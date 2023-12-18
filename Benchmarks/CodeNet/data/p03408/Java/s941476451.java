import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC091B - Two Colors Card Game

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // 1 <= n,m <= 100
        String[] s = new String[n];   // 1 <= 長さ <= 101 
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] t = new String[m];
        for (int j = 0; j < m; j++) {
            t[j] = sc.next();
        }
 
        int loop = n > m ? n : m;
        int max = 0;
        for (int k = 0; k < n; k++) {
            int count = 0;
            for (int l = 0; l < loop; l++) {
                if (l < n) {
                    if (s[k].equals(s[l])) ++count;
                }
                if (l < m) {
                    if (s[k].equals(t[l])) --count;
                }
            }
            if (max < count) max = count;
        }
        
        System.out.println(max);
    }
}