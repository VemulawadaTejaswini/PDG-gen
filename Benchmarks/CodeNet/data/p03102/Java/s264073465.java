import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        
        int[] code = new int[m];
        for (int i = 0; i < m; i++) {
            code[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += code[j] * sc.nextInt();
            }

            if (sum + c > 0) count++;
        }
        System.out.println(count);
    }
}