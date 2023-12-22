import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int sumxor = array[0];
        for (int i = 1; i < n; i++) {
            sumxor ^= array[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sumxor^array[i]);
            if (i == n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        
    }
}
