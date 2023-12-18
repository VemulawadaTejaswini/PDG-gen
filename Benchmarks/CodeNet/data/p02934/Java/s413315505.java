import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            total += ((double)1/num);
        }
        System.out.println(1/total);
    }
}
