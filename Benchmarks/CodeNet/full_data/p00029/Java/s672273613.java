import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<String> list = Arrays.<String>asList(input);
        String frequency = getFrequency(list);
        String longest = getLongest(list);
        System.out.println(longest + " " + frequency);
    }

    private static String getLongest(List<String> list) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        int max = 0;
        String res = "";
        for (String key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                res = key;
            }
        }
        return res;
    }

    private static String getFrequency(List<String> list) {
        int max = 0;
        String res = "";
        for (String s : list) {
            if (max < s.length()) {
                max = s.length();
                res = s;
            }
        }
        return res;
    }

}