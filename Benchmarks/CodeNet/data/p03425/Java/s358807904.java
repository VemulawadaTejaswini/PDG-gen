import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] initials = {'M', 'A', 'R', 'C', 'H'};
        int n = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            char initial = name.charAt(0);
            if(initial == 'M' || initial == 'A' || initial == 'R' || initial == 'C' || initial == 'H') {
                map.put(initial, map.getOrDefault(initial, 0) + 1);
            }
        }
        long count = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < 4; j++) {
                for(int k = j + 1; k < 5; k++) {
                    count += (map.getOrDefault(initials[i], 0) * map.getOrDefault(initials[j], 0) * map.getOrDefault(initials[k], 0));
                }
            }
        }
        System.out.println(count);
    }
}
