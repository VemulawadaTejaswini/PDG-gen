import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        Map<Character, Integer> freq = new HashMap<>();
        int max = 0;
        int cnt = 0;
        for(int i = 1; i < s.length(); i++) {
            freq.clear();
            cnt = 0;
            for(int j = 0; j < i; j++) {
                char c = s.charAt(j);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }  
            for(int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if(freq.containsKey(c)) {
                    cnt++;
                    freq.remove(c);
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
