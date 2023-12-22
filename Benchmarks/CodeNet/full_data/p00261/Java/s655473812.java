import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, HashMap<Character, Character>> map = new HashMap<>();
        map.put('A', new HashMap<>());
        map.get('A').put('0', 'X');
        map.get('A').put('1', 'Y');
        map.put('X', new HashMap<>());
        map.get('X').put('1', 'Z');
        map.put('Y', new HashMap<>());
        map.get('Y').put('0', 'X');
        map.put('Z', new HashMap<>());
        map.get('Z').put('0', 'W');
        map.get('Z').put('1', 'B');
        map.put('W', new HashMap<>());
        map.get('W').put('0', 'B');
        map.get('W').put('1', 'Y');
        map.put('B', new HashMap<>());
        map.get('B').put('0', 'Y');
        map.get('B').put('1', 'X');
        while (true) {
            char[] arr = sc.next().toCharArray();
            if (arr[0] == '#') {
                break;
            }
            char cur = 'A';
            boolean flag = true;
            for (char c : arr) {
                if (map.get(cur).containsKey(c)) {
                    cur = map.get(cur).get(c);
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (cur != 'B') {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            System.out.flush();
        }
    }
}
