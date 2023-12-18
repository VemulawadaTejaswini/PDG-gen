import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        boolean[] array = new boolean[100000001];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (array[m]) {
                array[m] = false;
            } else {
                array[m] = true;
            }
        }
        for(int i = 0; i < 100000001; i++) {
            if (array[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }    
}
