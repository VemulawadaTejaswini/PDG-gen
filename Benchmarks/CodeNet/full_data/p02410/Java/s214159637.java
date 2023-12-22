
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int nm[][] = new int[n][m];
    static int ab[] = new int[m];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                nm[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++){
            ab[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int result = 0;
            for (int j = 0; j < m; j++){
                 result += nm[i][j] * ab[j];
            }
            System.out.println(result);
        }
    }
}

