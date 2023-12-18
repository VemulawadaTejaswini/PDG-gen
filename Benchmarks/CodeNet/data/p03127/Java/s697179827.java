import java.util.Scanner;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int ans = A[0];
        
        for (int i = 0; i < N; i++) {
            final Numeric numeric = new Numeric(ans, A[i]);
            ans = numeric.getGcd();
        }
        
        System.out.println(ans);
    }
    
    public static class Numeric {
        private int a;
        private int b;
        
        public Numeric(final int a, final int b) {
            this.a = a < b ? a : b;
            this.b = (a + b) - this.a;
        }
        
        public int getGcd() {
            int tmp;
            while ((tmp = a % b) != 0) {
                a = b;
                b = tmp;
            }
            return b;
        }
    }
}