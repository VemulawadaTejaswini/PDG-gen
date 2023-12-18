import java.util.Scanner;

public class Main {
    static int n;
    static int k;
    static int[] a = {1,2,4,6,8,9,0};
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(n);
        System.out.println(count);
    }
    static void dfs(int i) {
        boolean bl = true;
        if (i <= 0) return;
        for (int j = 0; j < a.length; j++) {
            if (String.valueOf(i).contains(String.valueOf(a[j]))
                    || !String.valueOf(i).contains("3")
                    || !String.valueOf(i).contains("5")
                    || !String.valueOf(i).contains("7"))
            {
                bl = false;
            }
        }
        if (bl) count++;
        dfs(i-1);
    }
}