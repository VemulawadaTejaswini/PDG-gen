import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (Integer i = 1; i <= N; i++) {
            map.put(Integer.parseInt(sc.next()), i);
        }
        Set<Map.Entry<Integer, Integer>> sets = map.entrySet();
        sets.forEach(set -> out.print(set.getValue() + " "));
        out.println();
        
        out.flush();
    }
}