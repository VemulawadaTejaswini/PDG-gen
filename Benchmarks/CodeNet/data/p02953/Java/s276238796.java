import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h  = new int[n];
        for (int i = 0;i<n;i++) {
            h[i] = sc.nextInt();
        }

        int decCount = 0;
        for (int i = 0;i < n-1;i++) {
            if (h[i] < h[i+1]) {
                decCount++;
            }
            if (decCount > 1) {
                break;
            }
        }

        if (decCount > 1) {
            System.out.println("No");
        } else{
            System.out.println("Yes");            
        }
        
    }
}
