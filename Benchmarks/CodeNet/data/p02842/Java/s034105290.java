import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            int a =(int)(i * 1.08);
            if(a == n){
                ans = i;
            }
        }
        System.out.println(ans < 0 ? ":(" : ans);
        sc.close();

    }

}
