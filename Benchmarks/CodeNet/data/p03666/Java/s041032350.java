import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long A = scan.nextLong()*2;
        long B = scan.nextLong()*2;
        long C = scan.nextLong()*2;
        long D = scan.nextLong()*2;
        long diff = Math.abs(A-B);
        boolean found = false;
        long center = N % 2 == 0 ? (C+D)/2 : 0;
        long gap = (D-C)/2*(N-1);
        for (int i = 0; i < (N+1)/2; i++) {
            if (D * N < center - gap) {
                break;
            }
            if (center-gap <= diff && diff <= center + gap) {
                found = true;
                break;
            }
            center += C+D;
        }
        System.out.println(found?"YES":"NO");
    }
}
