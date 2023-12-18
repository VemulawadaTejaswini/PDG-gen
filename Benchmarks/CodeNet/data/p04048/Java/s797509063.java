import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long X=sc.nextLong();
        if(N/2==X&&N%2==0){
            System.out.println(3*X);
            return;
        }else if(X<(double)N/2){
            System.out.println(N+X+X+X/2+X/2+X/2);
        }else{
            System.out.println(2*X);
        }
    }
}