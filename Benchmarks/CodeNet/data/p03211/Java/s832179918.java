import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        String A[] = String.valueOf(S).split("");
        int ans = Math.abs(100 * Integer.parseInt(A[0]) + 10 * Integer.parseInt(A[1]) + Integer.parseInt(A[2]) - 753);
        for (int i = 1; i < A.length - 2; i++) {
            int abs = Math.abs(
                    100 * Integer.parseInt(A[i]) + 10 * Integer.parseInt(A[i + 1]) + Integer.parseInt(A[i + 2]) - 753);
            if (ans > abs) {
                ans = abs;
            }
        }
        System.out.println(ans);
    }
}