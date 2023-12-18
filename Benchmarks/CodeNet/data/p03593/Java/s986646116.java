import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int g1;
        int g2;
        int g4;
        
        if (h % 2 == 0) {
            if (w % 2 == 0) {
                g1 = 0;
                g2 = 0;
                g4 = h * w / 4;
            } else {
                g1 = 0;
                g2 = h / 2;
                g4 = (h * w - h) / 4;
            }
        } else {
            if (w % 2 == 0) {
                g1 = 0;
                g2 = w / 2;
                g4 = (h * w - w) / 4;
            } else {
                g1 = 1;
                g2 = h / 2 + w / 2;
                g4 = h / 2 * w / 2;
            }
        }
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                String c = String.valueOf(str.charAt(j));
                if (map.containsKey(c)) {
                    int value = map.get(c);
                    map.put(c, value + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        
        boolean pass = true;
        
        while (g1 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 1 || v % 4 == 3) {
                    g1--;
                    map.put(entry.getKey(), entry.getValue() - 1);
                    ng = false;
                }
            }
            
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        while (g2 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 2) {
                    g2--;
                    map.put(entry.getKey(), entry.getValue() - 2);
                    ng = false;
                }
            }
            
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        while (g4 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 0) {
                    g4--;
                    map.put(entry.getKey(), entry.getValue() - 4);
                    ng = false;
                }
            }
            
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        for (Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if (v != 0) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
