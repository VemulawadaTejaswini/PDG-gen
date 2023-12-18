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
        int ans = 1;
        for(int i = 2; i<=M/ans; i++) {
            if(M%i ==0 && M/i < N) {
                System.out.println(ans);
                return;
            }
            if(M%i==0) ans = i;
        }
    }
}