import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i <= s.length(); i++) {
            for(int j = i + 1; j <= i + k && j <= s.length(); j++) {
                String sub = s.substring(i, j);
                set.add(sub);
            }
        }
        String[] subStrings = new String[set.size()];
        set.toArray(subStrings);
        Arrays.sort(subStrings);
        System.out.println(subStrings[k-1]);
    }
}
