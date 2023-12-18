import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        char[] c = s.toCharArray();

        for (int i=0;i<n;i++) {
            if (c[i] != c[k-1]) {
                c[i] = '*';
            }
        }

        System.out.println(String.valueOf(c));
    }
}
