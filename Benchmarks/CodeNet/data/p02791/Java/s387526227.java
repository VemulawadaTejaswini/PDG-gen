import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if(p <= min){
                ans++;
                min = p;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
