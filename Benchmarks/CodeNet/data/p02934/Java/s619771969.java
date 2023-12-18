import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        long b = 1;
        long c = 1;
        for(int i=0; i< n; i++) {
            a[i] = sc.nextInt();
            b = b*a[i];
        }
        float mo = 0;
        for(int j=0; j< n; j++){
            mo += b/a[j];
        }
        System.out.println(b/mo);

    }
}
