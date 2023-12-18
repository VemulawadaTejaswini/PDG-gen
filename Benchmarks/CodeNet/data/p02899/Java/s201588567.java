import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = i+1;
        }
        
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][1]);
            
            if (i != n-1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
