import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int cnt = 0;
        int Lmax = 0;
        int Rmin = 100000;
        for (int i=0; i<M; i++) {
            L[i] = sc.nextInt();
            if (L[i] > Lmax) Lmax = L[i];
            R[i] = sc.nextInt();
            if (R[i] < Rmin) Rmin = R[i];
        }
        for (int i=Lmax; i<=Rmin; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}