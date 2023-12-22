import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100001];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            array[a]++;
            ans += a;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            ans -= array[b] * b;
            ans += array[b] * c;
            array[c]+= array[b];
            array[b] = 0;
            System.out.println(ans);
        }
    }
}