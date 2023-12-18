import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.nextLine());
        String[] subs = scan.nextLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < subs.length; i++) {
            int val = Integer.valueOf(subs[i]);
            if (map.containsKey(val)) map.replace(val, map.get(val) + 1);
            else map.put(val, 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) System.out.println(map.get(i));
            else System.out.println(0);
        }
    }
}