import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long k = cin.nextLong();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            map.put(i, cin.nextInt());
        }
        int res = 1;
        k = k % n;
        for (long i = 0; i<k; i++) {
            res = map.get(res);
        }
        System.out.print(res);
    }
}