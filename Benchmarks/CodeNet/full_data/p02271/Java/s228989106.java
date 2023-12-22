import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = getInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = getInt();
        int m = getInt();
        for(int i = 0; i < m; i++) {
            int q = getInt();
            String ans = "no";
            for(int j = 0; j < (1 << n); j++) {
                int sum = 0;
                for(int k = 0; k < n; k++) {
                    sum += A[k] * ((j >> k) & 1);
                }
                if(sum == q) {
                    ans = "yes";
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    static int getInt() {
        return Integer.parseInt(sc.next());
    }
}

