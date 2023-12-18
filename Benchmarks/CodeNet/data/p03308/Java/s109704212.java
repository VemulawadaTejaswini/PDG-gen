import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            min = Math.min(min, m);
            max = Math.max(max, m);
        }
        System.out.println(max - min);
    }    
}
