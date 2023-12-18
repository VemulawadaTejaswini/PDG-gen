import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] - array[i] > k) ok = false;
            }
        }
        
        if (ok) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
