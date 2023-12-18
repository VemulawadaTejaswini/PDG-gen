import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        Map<String, Integer> oddMap = new HashMap<>();
        Map<String, Integer> evenMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = line[i];
            if ((i + 1) % 2 == 1) {
                putOrIncrement(oddMap, s);
            } else {
                putOrIncrement(evenMap, s);
            }
        }

        String oddMaxKey = getMaxKey(oddMap);
        String evenMaxKey = getMaxKey(evenMap);
        int oddMaxValue = oddMap.get(oddMaxKey);
        int evenMaxValue = evenMap.get(evenMaxKey);

        if (oddMaxKey.equals(evenMaxKey)) {
            if (oddMaxValue < evenMaxValue) {
                oddMap.remove(oddMaxKey);
                oddMaxValue = oddMap.isEmpty() 
                    ? 0 : oddMap.get(getMaxKey(oddMap)); 
            } else {
                evenMap.remove(evenMaxKey);
                evenMaxValue = evenMap.isEmpty() 
                    ? 0 : evenMap.get(getMaxKey(evenMap)); 
            }
        }
        out.println(N - oddMaxValue - evenMaxValue);
        out.close();
    }

    private static void putOrIncrement(Map<String, Integer> map, String s) {
        if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }
    }

    private static String getMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}