import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] ints = new long[n];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i ++){
            ints[i] = scanner.nextInt();
            if (map.containsKey(ints[i]))
                map.put(ints[i], map.get(ints[i])+ 1);
            else
                map.put(ints[i], 1);
        }
        int sum = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()){
            for (int i = 1; i < entry.getValue(); i ++)
                sum += i;
        }
        for (int i = 0; i < n; i ++)
            System.out.println(sum - map.get(ints[i]) + 1);
    }
}
