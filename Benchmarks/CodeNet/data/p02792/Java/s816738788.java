import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println(n);
            return;
        }
        int[][] field = new int[10][10];
        for (int i = 1; i < 10; i++) {
            field[i][i]++;
        }
        int base = 10;
        int top = 1;
        while (base <= n) {
            for (int i = 0; i < 10 && base <= n; i++) {
                field[top][i]++;
                base++;
            }
            top++;
            if (top == 10) {
                top = 1;
            }
        }
        long count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                count += field[i][j] * field[j][i];
            }
        }
        System.out.println(count);
    }
}