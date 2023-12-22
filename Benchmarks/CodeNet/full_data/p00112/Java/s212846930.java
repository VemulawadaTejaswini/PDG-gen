import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += list.get(i-1)*(n-i);
        }
        
        System.out.println(sum);
    }
}