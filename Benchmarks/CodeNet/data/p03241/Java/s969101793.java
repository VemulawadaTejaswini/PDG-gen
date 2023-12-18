import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N==1) {
            System.out.println(M);
            return;
        }
        int ans = M;
        for(int i = 2; i<=M/N; i++) {
            if(M%i != 0) continue;
            if(i < N) {
                ans = M/i;
            }else {
                ans = M/i;
                System.out.println(ans);
                return;
            }

        }
    }
}