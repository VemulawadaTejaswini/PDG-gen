import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int ans= 0;
        for(int i = 0; i<N; i++) {
            int t = sc.nextInt();
            ans++;
            int cnt = 1;
            while(t+1<=D) {
                ans++;
                cnt++;
                t = t*cnt;
            }
        }
        System.out.println(ans+X);
    }
}