import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.merge(s.charAt(i), 1, Integer::sum);
            map2.merge(t.charAt(i), 1, Integer::sum);
        }
        List<Map.Entry<Character, Integer>> list1 = new ArrayList<>(map1.entrySet());
        List<Map.Entry<Character, Integer>> list2 = new ArrayList<>(map2.entrySet());
        list1.sort(Map.Entry.comparingByValue());
        list2.sort(Map.Entry.comparingByValue());
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getValue() != list2.get(i).getValue()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}