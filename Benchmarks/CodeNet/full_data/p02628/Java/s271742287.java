import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();
        var k = scaner.nextInt();
        var p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scaner.nextInt();
        }

        Arrays.sort(p);

        var ans = 0;
        for (int i = 0; i < k; i++) {
            ans += p[i];
        }

        System.out.println(ans);

        scaner.close();
    }

}