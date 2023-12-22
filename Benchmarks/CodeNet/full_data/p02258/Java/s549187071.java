import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bd = new StringBuilder();

        int n = sc.nextInt();

        int r0 = sc.nextInt();
        int r1 = sc.nextInt();

        int max = r1 - r0;
        int min = Math.min(r0, r1);

        for (int i=2; i<n; i++) {
            int r = sc.nextInt();
            max = Math.max(max, r-min);
            min = Math.min(min, r);
        }

        System.out.println(max);
    }
}
