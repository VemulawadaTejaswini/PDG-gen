import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] bool = new boolean[1000000001];
        boolean judge = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (bool[a[i]] == false) {
                bool[a[i]] = true;
            } else {
                judge = false;
            }
        }
        if (judge) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}