import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
     
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
 
        String line;
        String[] sline = new String[10];
        String key = "";
        int value;

        Map<String, Integer> map = new HashMap<>();

        line = sc.nextLine();

        for (int i = 0; i < N; i++) {
            line = sc.nextLine();

            sline = line.split("");
            Arrays.sort(sline);
            key = String.join("", sline);

            if (map.containsKey(key)) {
                value = map.get(key) + 1;
            } else {
                value = 1;
            }
            map.put(key, value);
        }

        Collection clct = map.values();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(clct);
        Collections.sort(array, Comparator.reverseOrder());
 
        long count = 0;
        long pairs;
        
        for (int i = 0; i < (int) array.size(); i++) {
            pairs = (int) array.get(i) * ((int) array.get(i) - 1) / 2;
            count += pairs;
        }
        System.out.println(count);
    }
}