import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        
        int[] b = IntStream.range(0, m)
                        .map(i -> sc.nextInt())
                        .toArray();
        
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int[] a = IntStream.range(0, m)
                        .map(j -> sc.nextInt())
                        .toArray();
            int tmp = c;
            for(int j = 0; j < m; j++) {
                tmp += (a[j] * b[j]);
            }
            // System.out.println(tmp);
            if(tmp > 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
