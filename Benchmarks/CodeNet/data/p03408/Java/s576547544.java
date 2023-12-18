import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by weiyuan on 2018/03/16.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> result = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int b = 0; b < a; ++b) {
            String temp = sc.next();
            if(result.containsKey(temp)) {
                result.put(temp, (result.get(temp) + 1));
            }
            else {
                result.put(temp, 1);
            }
        }

        a = sc.nextInt();
        for(int b = 0; b < a; ++b) {
            String temp = sc.next();
            if(result.containsKey(temp)) {
                result.put(temp, (result.get(temp) - 1));
            }
            else {
                result.put(temp, -1);
            }
        }

        Integer current = 0;
        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            Integer temp = entry.getValue();
            if(temp > current) {
                current = temp;
            }
        }
        System.out.println(current);
    }
}
