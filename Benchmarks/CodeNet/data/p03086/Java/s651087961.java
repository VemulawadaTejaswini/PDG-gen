import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int length = str.length;
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("C", "C");
        map.put("G", "G");
        map.put("T", "T");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (map.containsValue(str[i])) {
                sb.append(str[i]);
            } else {
                set.add(sb.toString());
                sb.setLength(0);
            }
            if (i == length -1) {
                set.add(sb.toString());
                sb.setLength(0);
            }
        }
        int max = 0;
        for (String tmp : set) {
            if (max < tmp.length()) max = tmp.length();
        }
        System.out.println(max);
    }
}