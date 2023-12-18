import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int standard = s.nextInt();
        int array[] = new int[standard];

        HashMap<Integer, Integer> map = new HashMap<>();

        int distance = 0;
        int temp = 0;

        for (int i = 0; i < standard; i++) {
            array[i] = s.nextInt();

            temp = array[i] - i - 1;

            if (map.get(temp) == null) {
                map.put(temp, 1);
            } else {
                map.put(temp, map.get(temp)+1);
            }
        }

        int result = 0;
        int finalKey = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > result) {
                result = map.get(key);
                finalKey = key;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < standard; i++) {
            ans += Math.abs(array[i]-(finalKey + i + 1));
        }

        System.out.println(ans);
    }
}