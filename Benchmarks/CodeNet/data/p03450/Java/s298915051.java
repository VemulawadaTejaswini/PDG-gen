
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int xLi = sc.nextInt();
            int xRi = sc.nextInt();
            int xDi = sc.nextInt();
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }
        
//        for (int i = 1; i <= n; i++) {
//            U.println("i: " + i);
//            for (int k : d[i].keySet()) {
//                U.println("\tk: " + k + "\tv: " + d[i].get(k));
//            }
//        }

        for (int k = 1; k <= n; k++) {
            for (int i : d[k].keySet()) {
                int d1 = d[k].get(i);
                
                for (int j  : d[k].keySet()) {
                    int d2 = d[k].get(j);
                    
                    if (d[i].get(j) != null && d2 - d1 != d[i].get(j)) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}