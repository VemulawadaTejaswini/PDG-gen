import java.util.Scanner;
import java.util.Map; 
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        Map<Integer, Map<Integer, Integer>> row = new HashMap<Integer, Map<Integer, Integer>>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (a - j < 0 || b - k < 0) continue;
                    else {
                        if (row.containsKey(a - j)) {
                            if (row.get(a - j).containsKey(b - k)) {
                                row.get(a - j).put(b - k, row.get(a - j).get(b - k) + 1);
                            } else {
                                row.get(a - j).put(b - k, 1);
                            }
                        } else {
                            Map<Integer, Integer> column = new HashMap<Integer, Integer>();
                            column.put(b - k, 1);
                            row.put(a - j, column);
                        }
                    }
                }
            }
        }
        sc.close();

        long count[] = new long[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < h - 2; i++) {
            if (row.containsKey(i)) {
                for (int j = 0; j < w - 2; j++) {
                    if (row.get(i).containsKey(j)) {
                        count[row.get(i).get(j)]++;
                    } else count[0]++;
                }
            } else {
                count[0] += (w - 2);
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
