import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        int completed = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1) {
                completed++;
            }
        }
        
        boolean canDiv2 = false;
        int d = 2;
        {
            int div = 0;
            
            for (int i = 0; i < N; i++) {
                boolean canDiv = false;
                
                while (A[i] % d == 0 && 0 < A[i] / d) {
                    A[i] /= d;
                    canDiv = true;
                }
                if (A[i] == 1) {
                    completed++;
                }
                
                if (canDiv) {
                    div++;
                }
            }
            if (div == N) {
                System.out.println("not coprime");
                return;
                
            } else if (2 <= div) {
                canDiv2 = true;
            }
        }
        
        d = 3;
        while (completed < N) {
            int div = 0;
            
            for (int i = 0; i < N; i++) {
                boolean canDiv = false;
                
                while (A[i] % d == 0 && 0 < A[i] / d) {
                    A[i] /= d;
                    canDiv = true;
                }
                if (A[i] == 1) {
                    completed++;
                }
                
                if (canDiv) {
                    div++;
                }
            }
            if (div == N) {
                System.out.println("not coprime");
                return;
                
            } else if (2 <= div) {
                canDiv2 = true;
            }
            
            d += 2;
        }
        
        System.out.println(canDiv2 ? "setwise coprime" : "pairwise coprime");
    }
}
