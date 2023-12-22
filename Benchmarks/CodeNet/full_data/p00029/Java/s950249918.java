import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
 
            // ??\???
            while (sc.hasNextLine()) {
                String[] sentence = sc.nextLine().split(" ");
 
                // ???????????????1?????????????????????¢???
                Main main = new Main();
                String frequencyWord = main.maxFrequency(sentence);
 
                // ?????????????????????????????????¢???
                String longWord = main.maxLong(sentence);
 
                // ????????????
                System.out.println(frequencyWord + " " + longWord);
            }
 
        } finally {
            sc.close();
        }
    }
 
    // value??????????????????§??????key?????????
    public String maxFrequency(String[] s) {
        Map<String, Integer> frequency = new HashMap<String, Integer>();
        for (String word : s) {
            int count = 1;
            if (frequency.containsKey(word)) {
                count += frequency.get(word);
            }
            frequency.put(word, count);
        }
 
        return valueSort(frequency).get(0).getKey();
 
    }
 
    //
    public String maxLong(String[] str) {
        // ??????????????????????????????List?????\??????
        List<String> list = new ArrayList<String>(new HashSet<String>(
                Arrays.asList(str)));
 
        String max = new String();
        for (String s : list) {
            if (max.length() < s.length()) {
                max = s;
            }
        }
        return max;
    }
 
    // Map???value???§?????????????????????
    private List<Map.Entry<String, Integer>> valueSort(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
                map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> map1,
                    Map.Entry<String, Integer> map2) {
                return map2.getValue().compareTo(map1.getValue());
            }
        });
        return list;
    }
}