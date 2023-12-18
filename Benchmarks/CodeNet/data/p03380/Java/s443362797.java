import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = a[n-1];
        int d = Math.min(a[0], m-a[0]);
        int ans = a[0];
        for (int i = 0; i < n-1; i++) {
            int min = Math.min(a[i], m-a[i]);
            if(d < min){
                ans = a[i]; d = min;
            }
        }
        System.out.println(m + " " + ans);
        sc.close();

    }

}
