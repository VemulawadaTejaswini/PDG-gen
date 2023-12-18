import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        
        long[] cumsum = new long[n+1];
        for (int i = 0; i < n; i++) {
            cumsum[i+1] = cumsum[i] + array[i];
        }
        // System.out.println(Arrays.toString(cumsum));
        
        int ok = 1;
        for (int i = n-1; i > 0; i--) {
            if (cumsum[i] * 2 >= array[i]) {
                ok++;
            } else {
                break;
            }
        }
        System.out.println(ok);
    }
}
