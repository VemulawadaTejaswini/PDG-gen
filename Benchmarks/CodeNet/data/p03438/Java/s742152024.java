import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long diffSum = 0;
        for (int i = 0; i < n; i++) {
            long diff = (long)(b[i] - a[i]);
            if(diff < 0) diffSum += diff * 2;
            else diffSum += diff;
        }
        if(diffSum < 0) System.out.println("No");
        else System.out.println("Yes");
        sc.close();
    }

}
