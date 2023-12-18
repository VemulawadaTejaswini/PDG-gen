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
        for (int i = 1; i <= k; i++) {
            temp = map.get(temp);
            if (target.indexOf(String.valueOf(temp)) != target.lastIndexOf(String.valueOf(temp))) {
                break;
            }
            target.append(temp);
        }
        String sentou = target.substring(0, target.indexOf(String.valueOf(temp)));
        String kurikaeshi = target.substring(target.indexOf(String.valueOf(temp)), target.lastIndexOf(String.valueOf(temp)));

        int ans = 0;
        if ((k - sentou.length()) % kurikaeshi.length() == 0) {
            ans = map.get(temp);
        } else {
            for (int i = 1; i < (int)(k - sentou.length()) % kurikaeshi.length(); i++) {
                temp = map.get(temp);
                ans = map.get(temp);
            }
        }
        System.out.println(ans);
    }
}