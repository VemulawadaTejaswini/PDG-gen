import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt()-1;
            a[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(0 < k - q + a[i]) sb.append("Yes");
            else sb.append("No");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
