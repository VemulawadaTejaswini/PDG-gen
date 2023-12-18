import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Z = new int[N];
        for(int n = 0; n < N; n++) {
            Z[n] = sc.nextInt();
        }
        int R = 0;
        int X = 0;

        for (int i = 0; i < N - 1; i++) { 
            for(int j = i + 1; j < N; j++) {
                X = Z[i] * Z[j];
                R = R + X;
            }
        }
        System.out.println(R);
    }
}