import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                max = Math.max(max, map.get(s) +1);
                map.put(s, map.get(s) +1);
            } else {
                map.put(s, 1);
            }
        }
//        String[] array = new String[map.size()];
        List<String> array = new ArrayList<>();
        int i = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
//                array[i] = key;
                array.add(key);
                i++;
            }
        }
//        Arrays.sort(array);
        Collections.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}