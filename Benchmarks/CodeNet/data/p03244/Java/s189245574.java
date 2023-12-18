import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> hashE = new HashMap<>();
        HashMap<Integer, Integer> hashO = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            if (i % 2 == 0) {
                hashE.put(in, hashE.getOrDefault(in, 0) + 1);
            } else {
                hashO.put(in, hashO.getOrDefault(in, 0) + 1);
            }
        }
    
        List<Map.Entry<Integer, Integer>> listE =
                hashE.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(toList());
    
        List<Map.Entry<Integer, Integer>> listO =
                hashO.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(toList());
    
        Map.Entry<Integer, Integer> e1 = listE.get(0);
        Map.Entry<Integer, Integer> e2 = 1 < listE.size() ? listE.get(1) :
                new AbstractMap.SimpleEntry<>(-1,0);
    
        Map.Entry<Integer, Integer> o1 = listO.get(0);
        Map.Entry<Integer, Integer> o2 = 1 < listO.size() ? listO.get(1) :
                new AbstractMap.SimpleEntry<>(-1,0);
        
        if (e1.getKey().equals(o1.getKey())) {
            System.out.println(n - Math.max(e1.getValue() + o2.getValue(),
                    e2.getValue() + o1.getValue()));
        } else {
            System.out.println(n - e1.getValue() - o1.getValue());
        }
    }
}
