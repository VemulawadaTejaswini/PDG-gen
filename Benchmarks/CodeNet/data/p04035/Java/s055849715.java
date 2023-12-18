import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<N-1;i++) {
            if (a[i]+a[i+1]>=L) {
                System.out.println("Possible");
                for (int j=0;j<i;j++) {
                    System.out.println(j+1);
                }
                for (int j=N-2;j>=i;j--) {
                    System.out.println(j+1);
                }
                return;
            }
        }
        System.out.println("Impossible");
    }
}
