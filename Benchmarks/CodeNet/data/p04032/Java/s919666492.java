

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] s = sc.next().toCharArray();
        HashMap<Character, Integer> ans = new HashMap<>();
        HashMap<Character, Integer> firstIndex = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (ans.containsKey(s[i])) {
                int size = ans.get(s[i]) + 1;
                ans.put(s[i], size);
                if (size > Math.ceil((double) s.length / 2)) {
                    System.out.println(firstIndex.get(s[i]) + " " + (i + 1));
                    return;
                }
            } else {
                ans.put(s[i], 1);
                firstIndex.put(s[i], i + 1);
            }
        }

        System.out.println("-1 -1");
    }

}
