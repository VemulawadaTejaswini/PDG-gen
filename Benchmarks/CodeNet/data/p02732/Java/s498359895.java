import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            map.put(a[i], map.getOrDefault(a[i], 0) +1);
        }
        
        long c = 0;
        for (Integer i : map.keySet()) {
            long j = map.get(i);
            if(j >= 2){
                c += (j * (j-1)) /2;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(c - (map.get(a[i]) -1)).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}