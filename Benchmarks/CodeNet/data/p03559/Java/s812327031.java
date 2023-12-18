import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        Integer[] C = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scan.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long answer = 0;
        int s = 0;
        int t = 0;
        for (int i = 0; i < N; i++) {
            while(s<N&&A[s]<B[i]) {
                s += 1;
            }
            while(t<N&&C[t]<=B[i]){
                t += 1;
            }
            answer += (long) (s)*(N-t);
        }
        System.out.println(answer);
    }
}
