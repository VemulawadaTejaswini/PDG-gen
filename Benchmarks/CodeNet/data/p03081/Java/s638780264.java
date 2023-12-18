import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }

        for (int i = 0; i < q; i++) {
            char t = sc.next().charAt(0);
            int  d = sc.next().charAt(0) == 'L' ? -1 : 1;

            for (int j = 0; j < n; j++) {
                if (s[j] == t) {
                    if (j + d >= 0 && j + d < n) {
                        array[j+d] += array[j];
                    }
                    array[j] = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += array[i];
        }

        System.out.println(ans);
    }
}
