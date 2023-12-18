import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        long[] A = new long[n];
        long[] B = new long[n];
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            B[i] = Integer.parseInt(sc.next());
        }
        for(int i = n - 1; i >= 0; i--) {
            if(res + A[i] <= B[i]) res += B[i] - (res + A[i]);
            else if((res + A[i]) % B[i] == 0) continue;
            else res += B[i] * ((res + A[i]) / B[i] + 1L) - (res + A[i]);
        }
        System.out.println(res);
    }
}
