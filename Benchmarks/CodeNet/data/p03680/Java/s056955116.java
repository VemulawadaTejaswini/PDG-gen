
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int[] g;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        g = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            g[i] = a;
        }
        Set<Integer> s = new HashSet<>();
        int current = 1;
        while(!s.contains(current)) {
            s.add(current);
            if(!s.contains(g[current])) {
                current = g[current];
            }
        }

        if(s.contains(2)) {
            System.out.println(2);
        }
        else {
            System.out.println(-1);
        }
    }
}