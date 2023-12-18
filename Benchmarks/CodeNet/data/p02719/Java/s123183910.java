import java.util.*;
public class Main {//ここが Main になっている
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        // System.out.println(N+" "+K);
        int next_n;
        while (true) {
            next_n = Math.abs(N - K);
            if (next_n <= N){
                N = next_n;
                continue;
              }
            if (next_n >= N)
              {
                // return N;
                System.out.println(N);
                break;
              }
        }
    }
}
