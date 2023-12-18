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
                for(int i = 0; i < n-1; i++) {
                    if(H[i] == 0 || H[i+1] == 0) continue;
                    int height1 = H[i] + Math.abs(X[i] - x) + Math.abs(Y[i] - y);
                    int height2 = H[i+1] + Math.abs(X[i+1] - x) + Math.abs(Y[i+1] - y);
                    if(height1 != height2) break;
                    if(i == n-2) {
                        System.out.println(x + " " + y + " " + height1);
                        return;
                    }
                }
            }
        }
    }
}
