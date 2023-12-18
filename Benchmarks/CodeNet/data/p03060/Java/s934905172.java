import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Vs = new int[N];
        int[] Cs = new int[N];
        int X_Y = 0;
        
        for (int i=0; i<N; i++) {
            Vs[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            Cs[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            if (Vs[i] > Cs[i]) {
                X_Y += Vs[i] - Cs[i];
            }
        }

        System.out.println(X_Y);
    }
}
