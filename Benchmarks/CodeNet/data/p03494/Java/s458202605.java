import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<N; i++){
            int a = sc.nextInt();
            int cnt = 0;
            while (true) {
                if (a % 2 == 0){
                    a /= 2;
                    cnt ++;
                }
                else
                    break;
            // System.out.println(String.format("%d, %d", cnt,a));
            ans = Math.min(ans, cnt);

            }
        }
        System.out.println(ans);

    }
}