import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> operations = new ArrayList<>();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int lower = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (b[j] == i) {
                    operations.add(i + lower - 1, b[j]);
                }
                if (b[j] <= i) {
                    lower++;
                }
            }
        }
        for(int i :operations){
            System.out.println(i);
        }
    }
}
