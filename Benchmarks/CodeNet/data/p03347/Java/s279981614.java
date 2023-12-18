import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean ch = true;
        long ans=0;
        long A = sc.nextLong();
        if (A != 0) {
            ch = false;
        }
        long B;
        for (long i = 1; i <N; i++) {
            B = sc.nextLong();
            if(B==0){
            }
            if(A-B>1){
                ch=false;
            }
            if(A<B){
                ans++;
            }
            if(B<=A){
                ans+=B;
            }
            A=B;
        }
        if (ch) {
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
    }
}