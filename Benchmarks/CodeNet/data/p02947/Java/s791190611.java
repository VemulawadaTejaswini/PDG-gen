import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Long> map = new HashMap<>();
        for(int i = 0;i < n;i++) {
            char[] tmp = sc.next().toCharArray();
            Arrays.sort(tmp);
            String str = String.valueOf(tmp);
            Long count = map.get(str);
            if(count == null) map.put(str, 1L);
            else map.put(str, count + 1);
        }

        System.out.println(map.keySet().stream().map(map::get).mapToLong(e -> (e * (e - 1) / 2)).sum());
    }

}
