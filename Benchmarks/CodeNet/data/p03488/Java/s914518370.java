import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        char[] tf = s.toCharArray();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("x", 0);
        map.put("y", 0);
        map.put("向き", 1);
        // 1 右 2 上 3 左 4 下
        int size = tf.length;
        for (int i = 0; i < size; i++) {
            char tmp = tf[i];
            if (tmp == 'F') {
                // 移動
                if (map.get("向き") == 1) {
                    map.put("x", map.get("x") + 1);
                } else if (map.get("向き") == 3) {
                    map.put("x", map.get("x") - 1);
                } else if (map.get("向き") == 2) {
                    map.put("y", map.get("y") + 1);
                } else if (map.get("向き") == 4) {
                    map.put("y", map.get("y") + 1);
                }
            } else {
                // 向き変更
                int muki = map.get("向き");
                int xx = map.get("x");
                int yy = map.get("y");
                if (muki == 1 || muki == 3) {
                    if (yy < y) {
                        map.put("向き", 2);
                    } else {
                        map.put("向き", 4);
                    }
                } else {
                    if (xx < x) {
                        map.put("向き", 1);
                    } else {
                        map.put("向き", 3);
                    }
                }
            }
        }
        int xx = map.get("x");
        int yy = map.get("y");
        if (xx == x && yy == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}