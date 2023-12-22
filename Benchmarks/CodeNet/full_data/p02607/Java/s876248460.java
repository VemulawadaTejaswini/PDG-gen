import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1 && array[i] % 2 == 1) count++;
        }
        System.out.println(count);
    }
}
