import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(H, W, N, A) );
    }

    private static String solve(int H, int W, int N, int[] A) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = i + 1;
            int a = A[i];
            for (int j = 0; j < a; j++) {
                b.append(String.valueOf(n));
            }
        }

        StringJoiner j = new StringJoiner("\n");
        for (int h = 0; h < H; h++) {
            StringJoiner j2 = new StringJoiner(" ");
            for (int w = 0; w < W; w++) {
                int i = h * W + w;
                j2.add( Character.toString(b.charAt(i)) );
            }
            if( h % 2 == 0 ) {
                j.add( j2.toString() );
            } else {
                j.add( reverse(j2.toString()) );
            }
        }
        return j.toString();
    }

    private static String reverse(String s) {
        StringBuilder b = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            b.append(s.charAt(i));
        }
        return b.toString();
    }
}
