import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int ans = 0;
        for (int i = 1; i <= n; i++){
            int tmp = sc.nextInt();
            arr[i] = tmp;
            if (tmp < i && arr[tmp] == i)
                ans++;
        }
        System.out.println(ans);
    }
}