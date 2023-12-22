import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for(int i=1; i<=n; i++) {
            res += i * (n+1-i);
        }
        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long aa = Math.min(a, b);
            long bb = Math.max(a, b);

            res -= (aa * (n+1-bb));

        }
        System.out.println(res);


    }


}


