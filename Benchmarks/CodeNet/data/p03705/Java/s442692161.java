import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max=(N-1)*B+A;
        int min=(N-1)*A+B;
        if((N==1&A!=B)||A>B){
            System.out.println("0");
            return;
        }
        System.out.println(max-min+1);
    }
}