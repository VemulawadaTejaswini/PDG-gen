import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for (int i=0;i<n;i++) {
            h[i] = sc.nextInt();
        }
        Set<Integer> hSet = new HashSet<>();
        for (int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a]>h[b]) {
                hSet.add(b);
            }
            if (h[a]<h[b]) {
                hSet.add(a);
            }
        }
        int hInt = hSet.size();
        System.out.println(n-hInt);

    }
}
