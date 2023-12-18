import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0 ; i < n - 1; i++) {
            list.get(a[i] - 1).add(b[i]);
        }

        int[] p = new int[q];
        int[] x = new int[q];
        for (int i = 0 ; i < q ; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i = 0 ; i < q ; i++) {
            c[p[i] - 1] += x[i];
        }
        for (int i = 0 ; i < n ; i++) {
            for (Integer inte : list.get(i)) {
                c[inte - 1] += c[i];
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < n ; i++) {
            sb.append(c[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

}