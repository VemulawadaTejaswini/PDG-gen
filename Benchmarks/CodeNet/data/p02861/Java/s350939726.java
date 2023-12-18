import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xlist = new int[n];
        int[] ylist = new int[n];

        for (int i = 0; i < n; i++) {
            xlist[i] = sc.nextInt();
            ylist[i] = sc.nextInt();
        }

        double ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.sqrt(Math.pow(xlist[i] - xlist[j], 2) + Math.pow(ylist[i] - ylist[j], 2));
            }
        }

        System.out.println(ans / n);
    }
}