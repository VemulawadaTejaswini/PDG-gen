import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt()-1;
            a[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
