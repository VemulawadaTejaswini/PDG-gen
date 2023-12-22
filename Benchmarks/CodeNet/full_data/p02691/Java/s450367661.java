import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var a = new int[n+1];

        var h = new HashMap<Integer,Integer>();
        for(int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            var value = h.get(i - a[i]);
            h.put(i - a[i], value == null ? 1 : value + 1);
        }
        long result = 0;
        for(int i = 1; i <= n; i++) {
            var value = h.get(i + a[i]);
            if(value != null) result += value;
        }
        System.out.println(result);
    }
}
