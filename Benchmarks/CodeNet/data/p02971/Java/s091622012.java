import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
            if (num >= first) {
                second = first;
                first = num;
            } else if (num >= second) {
                second = num;
            }
        }
        
        if (first == second) {
            for (int i = 0; i < n; i++) {
                System.out.println(first);
            }
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] == first) {
                System.out.println(second);
            } else {
                System.out.println(first);
            }
        }
        
    }
}
