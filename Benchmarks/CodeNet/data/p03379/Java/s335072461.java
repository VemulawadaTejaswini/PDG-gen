import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = i;
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));    // foo[][0]で
        
        int highmedian = array[n/2][0];
        int lowmedian = array[n/2-1][0];
        
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));    // foo[][0]で
        
        for (int i = 0; i < n; i++) {
            if (array[i][0] >= highmedian) {
                System.out.println(lowmedian);
            } else {
                System.out.println(highmedian);
            }
        }
    }
}