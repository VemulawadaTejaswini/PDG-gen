import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(dfs(n));
    }
    static int dfs(int i) {
        String str = String.valueOf(i);
        boolean bl = true;
        for (int j = 0; j < k; j++) {
            if (str.contains(String.valueOf(a[j]))) {
                bl = false;
                break;
            }
        }
        if (bl) {
            return i;
        } else {
            return dfs(i+1);
        }
    }
}