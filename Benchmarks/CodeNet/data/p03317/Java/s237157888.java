import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int minCount = 0;
        int i = 0;
        while(i < n - 1) {
            if(i + k - 1 >= n) {
                minCount++;
                System.out.println(minCount);
                return;
            }
            minCount++;
            i += (k - 1);
        }
        System.out.println(minCount);
    }
}
