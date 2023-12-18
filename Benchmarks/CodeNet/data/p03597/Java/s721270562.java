import java.util.*;
 
class Main {
    void solve(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), A = in.nextInt();
        System.out.println(N * N - A);

    }
    public static void main(String[] args) {
        new Main().solve();
    }
}