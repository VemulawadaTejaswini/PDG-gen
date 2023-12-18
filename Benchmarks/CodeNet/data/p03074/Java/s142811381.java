import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int fast = 0;
        int slow = 0;
        int limit = 0;
        int max = 0;
        while(fast < s.length() && slow < s.length()) {
            if(s.charAt(fast) == '0') {
                while(fast < s.length() && s.charAt(fast) == '0') {
                    fast++;
                }
                limit++;
                if(limit <= k && fast < s.length()) max = Math.max(max, fast - slow + 1);
                if(limit <= k && fast == s.length()) max = Math.max(max, fast - slow);
                while(limit > k && slow <= fast) {
                    if(s.charAt(slow) == '0') {
                        while(slow < s.length() && s.charAt(slow) == '0') slow++;
                        limit--;
                        if(limit <= k && fast < s.length()) max = Math.max(max, fast - slow + 1);
                        if(limit <= k && fast == s.length()) max = Math.max(max, fast - slow);
                    } else {
                        slow++;
                    }
                }
            } else {
                max = Math.max(max, fast - slow + 1);
                fast++;
            }
        }
        System.out.println(max);
    }
}
