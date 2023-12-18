import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long max=(N-1)*B+A;
        long min=(N-1)*A+B;
        if((N==1&A!=B)||A>B){
            System.out.println("0");
            return;
        }
        System.out.println(max-min+1);
    }
}