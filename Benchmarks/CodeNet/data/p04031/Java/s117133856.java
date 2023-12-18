import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num[] = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            num[i] = m;
            total += m;
        }

        float average = (float)total / (float)n;
        
        float f = 0f;
        for (int i = 0; i < n; i++) {
            if (num[i] != (int)average + 1) {
                f += Math.pow(num[i] - average, 2);
            }
        }
        
        System.out.println((int)f + (f%1==0?0:1));
    }
}