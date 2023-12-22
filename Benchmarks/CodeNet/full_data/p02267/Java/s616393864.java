
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] S = new int [n];
        for (int i = 0; i < n; i++) {
            S[i] = s.nextInt();
        }
        int q = s.nextInt();
        int [] T = new int [q];
        for (int i = 0; i < q; i++) {
            T[i] = s.nextInt();
        }

        int C  = 0;
        for (int i = 0; i < q; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (T[i] == S[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                C++;
            }
        }
        System.out.println(C);
    }
}

