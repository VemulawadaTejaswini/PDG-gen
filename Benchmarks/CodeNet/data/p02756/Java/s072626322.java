import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        int[] T = new int[Q];
        int[] F = new int[Q];
        String[] C = new String[Q];
        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            T[i] = sc.nextInt();
            reverse = T[i] == 1 ? !reverse : reverse;
            if (T[i] == 2) {
                F[i] = sc.nextInt();
                C[i] = sc.next();
                if (F[i] == 1) {
                    S = reverse ? (S + C[i]) : (C[i] + S);
                } else {
                    S = reverse ? (C[i] + S) : (S + C[i]);
                }
            }
        }
        System.out.println(reverse ? new StringBuffer(S).reverse().toString() : S);

    }
}