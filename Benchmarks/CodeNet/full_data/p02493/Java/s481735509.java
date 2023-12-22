import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] aArray = new int[n];
        int i;
        
        for(i = 0; i < n; i++) {
            aArray[i] = scanner.nextInt();
        }        
        for(i = n - 1; i > 0; i--) {
            System.out.print(aArray[i] + " ");
        }
        System.out.println(aArray[0]);
    }
}