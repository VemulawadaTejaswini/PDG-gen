import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        int max = array[n-1];
        int min = array[0];
        
        int[][] data = new int[n][2];
        for (int i = 1; i < n; i++) {
            data[i][0] = array[i] - array[i-1];
            data[i][1] = i;
        }
        Arrays.sort(data, (a, b) -> Integer.compare(b[0], a[0]));    // foo[][0]で
        
        int ans = max - min;
        for (int i = 0; i < Math.min(k-1, n); i++) {
            ans -= data[i][0];
        }
        
        System.out.println(ans);
    }
}
