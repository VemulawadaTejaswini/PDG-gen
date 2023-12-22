import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main {
    public static Scanner sc;
    public static LinkedHashMap<Integer, Integer> map;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                
                if (map.get(a) == null) {
                    map.put(a, b*c);
                } else {
                    map.put(a, map.get(a) + b*c);
                }
            }
            
            boolean b = false;
            for (Integer key: map.keySet()) {
                if (map.get(key) >= 1000000) {
                    System.out.println(key);
                    b = true;
                }
            }
            
            if (!b) {
                System.out.println("NA");
            }
            b = true;
        }
    }
}

class Member {
    public int number;
    public int score;
    
    public Member(int n, int s) {
        number = n;
        score = s;
    }
}