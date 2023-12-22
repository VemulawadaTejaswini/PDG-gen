import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            if (n == 0) break;
            
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            
            Collections.sort(list);
            
            BigDecimal sum = new BigDecimal(0);
            for (int i = 1; i <= n; i++) {
                sum = sum.add(new BigDecimal(list.get(i-1)).multiply(new BigDecimal(n-i)));
            }
            
            System.out.println(sum.toString());
        }
    }
}