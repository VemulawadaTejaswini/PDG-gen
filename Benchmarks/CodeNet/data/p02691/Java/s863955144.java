import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(sc.next());
            map.put(i+a[i], map.getOrDefault(i+a[i], 0) +1);
        }
        long ans = 0;
        for(int j = 1; j <= n; j++){
            ans += map.getOrDefault(j-a[j], 0);
        }
        System.out.println(ans);
    }
}