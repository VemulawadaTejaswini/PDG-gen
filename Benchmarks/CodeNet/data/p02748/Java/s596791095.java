import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        Map<String, Integer> map = new HashMap<>();
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
            minA = Math.min(minA, A[i]);
        }
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < b; i++) {
            B[i] = sc.nextInt();
            minB = Math.min(minB, B[i]);
        }
        int min = minA + minB;

        for (int i = 0; i < m; i++) {
            int val = A[sc.nextInt()-1] + B[sc.nextInt()-1];
            int discount = sc.nextInt();
            min = Math.min(min, val-discount);
        }
        
        System.out.println(min);
    }
}
