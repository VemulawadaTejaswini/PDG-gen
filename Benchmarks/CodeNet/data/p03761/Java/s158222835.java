import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String str1 = sc.next();
        for (int i = 0; i < str1.length(); i++) {
            String key = String.valueOf(str1.charAt(i));
            int val = map.getOrDefault(key, 0);
            map.put(key, ++val);
        }
        for (int i = 1; i < n; i++) {
            Map<String, Integer> maptmp = new HashMap<String, Integer>();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                String key = String.valueOf(str.charAt(j));
                int val = maptmp.getOrDefault(key, 0);
                maptmp.put(key, ++val);
            }
            
            for (String key : map.keySet()) {
                int val = map.get(key);
                map.put(key, Math.min(val, maptmp.getOrDefault(key, 0)));
            }
        }
        
        int[] alphabet = new int[26];
        for (String key : map.keySet()) {
            int val = map.get(key);
            char c = key.charAt(0);
            int num = c - 'a'; // 'b' -> 1
            alphabet[num] = val;
        }
        
        boolean ng = true;
        for (int i = 0; i < 26; i++) {
            int max = alphabet[i];
            char c = (char)(i + 'a');
            for (int j = 0; j < max; j++) {
                System.out.print(c);
                ng = false;
            }
        }
        if (ng) return;
        System.out.println();
    }
}
