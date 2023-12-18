import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 3;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if(a[i] != 0 && 1 < b[a[i]-1] - b[a[i]]){
                ans = (ans * (long)(b[a[i]-1] - b[a[i]])) % 1000000007;
            }
            b[a[i]]++;
        }
        if(1 < b[0]) ans = ans * 2L  % 1000000007;
        System.out.println(ans);
        sc.close();

    }

}
