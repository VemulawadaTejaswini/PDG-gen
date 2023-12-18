import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean able = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(i < a[i]) able = false;
            if(0 < i && a[i-1] < a[i] && 1 < a[i] - a[i-1]) able = false;
        }
        if(!able){
            System.out.println(-1);
        }else{
            long ans = 0L;
            int[] b = new int[n];
            Arrays.fill(b, -1);
            for (int i = n-1; i > 0; i++) {
                if(b[i] != a[i]){
                    ans += a[i];
                }
                b[i-1] = a[i] - 1;
            }
            System.out.println(ans);

        }
        sc.close();

    }

}
