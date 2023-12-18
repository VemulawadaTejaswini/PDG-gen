import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import atCoder.aaa;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Map<String, String> map = new HashMap<>();
        for (int i = 0 ; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            String b = t.substring(i, i + 1);
            if (map.containsKey(b) && !map.get(b).equals(a)) {
                System.out.println("No");
                return;
            } else if (map.containsValue(a)){
                System.out.println("No");
                return;
            } else {
                map.put(b, a);
            }

        }


        System.out.println("Yes");
        //System.out.println("No");
    }

}