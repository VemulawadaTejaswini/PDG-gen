import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] H = new int[N];
        int Hmax = 0;
        int c = 0;
        for(int i = 0;i < N;i++){
            H[i] = sc.nextInt();
            if(Hmax <= H[i]){
                Hmax = H[i];
                c++;
            }
        }
        System.out.println(c);
    }
}
