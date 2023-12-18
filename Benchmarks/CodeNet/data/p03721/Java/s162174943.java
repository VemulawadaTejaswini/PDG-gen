import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Map<Integer,Integer> vals = new TreeMap<>();
        Set<Integer> valSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(valSet.contains(a)) {
                vals.put(a,vals.get(a)+b);
            } else {
                vals.put(a,b);
                valSet.add(a);
            }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> val : vals.entrySet()) {
            if(sum < k && sum + val.getValue() >= k) {
                System.out.println(val.getKey());
                return;
            }
            sum += val.getValue();
        }
    }
}
