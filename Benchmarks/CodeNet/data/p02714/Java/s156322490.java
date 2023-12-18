import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            List<Integer> list = new ArrayList<>();
            if (map.containsKey(c)) {
                list = map.get(c);
            }
            list.add(i);
            map.put(c, list);
        }
        List<Integer> rlist = map.get('R');
        List<Integer> glist = map.get('G');
        List<Integer> blist = map.get('B');
        long sum = 0;
        for (int i = 0; i < rlist.size(); i++) {
            for (int j = 0; j < glist.size(); j++) {
                for (int k = 0; k < blist.size(); k++) {
                    int[] rgb = new int[3];
                    rgb[0] = rlist.get(i);
                    rgb[1] = glist.get(j);
                    rgb[2] = blist.get(k);
                    Arrays.sort(rgb);
                    if (rgb[1] - rgb[0] != rgb[2] - rgb[1]) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }

}
