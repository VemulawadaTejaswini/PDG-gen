import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        String ans = "Yes";
        if (map.keySet().size() != 2) {
            ans = "No";
        }
        for (Character ch : map.keySet()) {
            if (map.get(ch) != 2) {
                ans = "No";
            }
        }
        System.out.println(ans);
    }

}
