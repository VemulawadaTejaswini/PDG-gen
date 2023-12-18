import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[3*n];
        for(int i=0; i<n*3; i++){
            a[i] = sc.nextLong();
        }
        sc.close();

        long ans = Long.MIN_VALUE;
        for(int i=n; i<=2*n; i++){
            long[] a1 = Arrays.copyOfRange(a, 0, i);
            long[] a2 = Arrays.copyOfRange(a, i, n*3);
            Arrays.sort(a1);
            Arrays.sort(a2);
            long mans = 0;
            for(int j=0; j<n; j++){
                mans += a1[a1.length-1-j];
                mans -= a2[j];
            }
            ans = Math.max(ans, mans);
        }

        System.out.println(ans);
    }
}