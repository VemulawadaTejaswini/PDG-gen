import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = 0;
        int num = 0;
        digits = sc.nextInt();
        num = sc.nextInt();

        Map<Integer, Integer> numMap = new HashMap<>();
        boolean duplicate = false;
        while (num > 0) {
            int keta = sc.nextInt();
            int nextNum = sc.nextInt();
            if (numMap.containsKey(keta) && !numMap.get(keta).equals(nextNum)) {
                duplicate = true;
            }
            numMap.put(keta, nextNum);
            num--;
        }

        int result=0;
        if (duplicate) {
            System.out.println(-1);
        } else {
            if ((digits == 2 || digits == 3) && numMap.containsKey(1) && numMap.get(1) == 0) {
                System.out.println(-1);
            } else if (digits == 3 && numMap.containsKey(1) && numMap.get(1) == 0 && numMap.containsKey(2) && numMap.get(2) == 0) {
                System.out.println(-1);
            } else {
                for(Map.Entry<Integer, Integer> entry: numMap.entrySet()) {
                    result += Math.pow(10, digits - entry.getKey())*entry.getValue();
                }
                System.out.println(result);
            }
        }
    }
}
