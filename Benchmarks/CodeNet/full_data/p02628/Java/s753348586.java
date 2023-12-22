import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        Arrays.setAll(array, i -> sc.nextInt());
        Arrays.sort(array);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += array[i];
        }
        System.out.println(ans);
    }
}