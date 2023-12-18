import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, X;
        N = scan.nextInt();
        X = scan.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
        }
        int [] dif = new int[N];
        for (int i = 0; i < N; i++) {
            dif[i] = Math.abs(x[i] - X);
        }
        Arrays.sort(dif);
        
        // for (int i = N - 1; i >= 0; i--) {
        //     System.out.println(dif[i]);
        // }
        
        boolean f = true;
        if (check(dif, dif[0])) {
            System.out.println(dif[0]);
            f = false;
        }
        for (int i = (int)(dif[0] / 2); i > 0 && f; i--) {
            if (dif[0] % i == 0) {
                if (check(dif, i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    
    public static boolean check(int[] array, int num) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % num != 0) {
                return false;
            }
        }
        return true;
    }
}
