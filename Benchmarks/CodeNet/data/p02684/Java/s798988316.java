import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i + 1, sc.nextInt());
        }
        StringBuilder target = new StringBuilder("1");
        int temp = map.get(1);
        target.append(temp);
        int count = 2;
        for (int i = 1; i <= k; i++) {
            temp = map.get(temp);
            if (target.indexOf(String.valueOf(temp)) != -1) {
                break;
            }
            target.append(temp);
            count++;
        }
        String sentou = target.substring(0, target.indexOf(String.valueOf(temp)));

        int ans = 0;
        if ((k - sentou.length()) % (target.length() - sentou.length()) == 0) {
            ans = temp;
        } else {
            for (int i = 1; i < (int)(k - sentou.length()) % (target.length() - sentou.length()); i++) {
                temp = map.get(temp);
                ans = map.get(temp);
            }
        }
        System.out.println(ans);
    }
}
