
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i <= x; i++) {
            map.put(Integer.parseInt(scanner.next()),i);
        }

        String res = "";
        for(int i = 1; i <= x; i++) {
            res += map.get(i) + " ";
        }
        System.out.println(res.trim());
    }
}