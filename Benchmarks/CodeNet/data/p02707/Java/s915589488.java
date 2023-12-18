
import sun.management.counter.Counter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] result = new int[num + 1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 2; i <= num; i++)
                map.put(i, sc.nextInt());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++){
                if (map.getOrDefault(j,0) == i){
                    result[i]++;
                    map.remove(j);
                }
            }
        }
        for (int i = 1; i <= num; i++){
            System.out.println(result[i]);
        }
    }
}
