import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int ans =0;
        int left = 0;
        int right = 0;
        while(right < n-1){
            left = right;
            while(right < n-1 && (a[right] - a[left]) * (a[right+1] - a[right]) >= 0)
                right++;
            ans++;
            right++;
        }
        if(right == n-1) ans++;
        System.out.println(ans);
        sc.close();

    }

}
