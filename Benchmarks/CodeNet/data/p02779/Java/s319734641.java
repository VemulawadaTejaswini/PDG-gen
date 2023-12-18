import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        boolean judge = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            Integer m = a[i];
            a[i] = -1;
            if (Arrays.asList(a).contains(m)) {
                judge = false;
                break;
            }
            a[i] = m;
        }
        if (judge) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}