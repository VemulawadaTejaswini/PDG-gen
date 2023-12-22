
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
            if (search(T[i], S)) {
                C++;
            }
        }
        System.out.println(C);
    }

    static boolean search(int a, int []S) {
        int left = 0;
        int right = S.length ;
        int middle;

        while (left < right) {
            middle = (left + right ) / 2;
            if (S[middle] == a) {
                return true;
            } else if (S[middle] < a) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return false;
    }
}

