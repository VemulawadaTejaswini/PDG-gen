import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - (i + 1);
            array2[i] = array[i];
        }
        Arrays.sort(array2);
        for (int i = 0; i < n; i++) {
            ans += Math.abs(array[i] - array2[n / 2]);
        }
        System.out.println(ans);
    }    
}
