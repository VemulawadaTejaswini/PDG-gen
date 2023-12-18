import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int n = sc.nextInt();
        Map<String, Integer> strings = new TreeMap<String, Integer>();
        String s;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            if (strings.containsKey(s)) {
                strings.put(s, strings.get(s)+1);
            } else {
                strings.put(s, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : strings.values()) {
            if (i > max) max = i;
        }
        for (Map.Entry<String, Integer> ans : strings.entrySet()) {
            if (ans.getValue() == max) {
                System.out.println(ans.getKey());
            }
        }
    }

}
