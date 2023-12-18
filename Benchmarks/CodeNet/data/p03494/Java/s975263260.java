import java.util.*;

import javax.print.event.PrintJobListener;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<N; i++){
            int a = sc.nextInt();
            System.err.println(a);
            int cnt = 0;
            while (true) {
                if (a % 2 == 0){
                    a /= 2;
                    cnt ++;
                }
                else
                    break;
            ans = Math.min(ans, cnt);

            }
        }
        System.out.println(ans);

    }
}