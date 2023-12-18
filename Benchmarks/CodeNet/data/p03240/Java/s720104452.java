import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        int[] H = new int[n];
        for(int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }
        for(int x = 0; x <= 100; x++) {
            for(int y = 0; y <= 100; y++) {
                int height = H[0] + Math.abs(X[0] - x) + Math.abs(Y[0] - y);
                for(int i = 1; i < n; i++) {
                    int tempHeight = H[i] + Math.abs(X[i] - x) + Math.abs(Y[i] - y);
                    if(height != tempHeight) break;
                    if(i == n-1) {
                        System.out.println(x + " " + y + " " + height);
                    }
                }
            }
        }
    }
}
