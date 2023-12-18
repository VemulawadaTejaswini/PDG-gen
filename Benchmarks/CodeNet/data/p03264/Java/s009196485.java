import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    int[][] d = new int[10][10];

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int e=K/2;
        int d;
        if(K%2==1){
            d=e+1;
        }else{
            d=e;
        }
        System.out.println(d*e);
    }
}