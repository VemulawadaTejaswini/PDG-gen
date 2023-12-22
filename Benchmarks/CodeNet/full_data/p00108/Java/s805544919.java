import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
    public static Scanner sc;
    public static ArrayList<Integer> list;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            if (n == 0) break;
            
            int[] ary = new int[n];
            int[] tmp = new int[n];

            for (int i = 0; i < n; i++) {
                ary[i] = sc.nextInt();
            }
            
            calc(ary, n);
        }
    }
    
    public static void calc(int[] a, int n) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int res = 0;
            for (int j = 0; j < n; j++) {
                if (num == a[j]) {
                    res++;
                }
            }
            b[i] = res;
        }
        
        boolean bn = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                bn = false;
            }
        }
        
        if (bn) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(a[i]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        } else {
            calc(b, n);
        }
        return;
    }
}