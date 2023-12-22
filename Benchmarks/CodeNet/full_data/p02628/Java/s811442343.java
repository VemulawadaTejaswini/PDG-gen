import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for(int i=0; i<n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(p);
        
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += p[i];
        }
        
        System.out.println(sum);
    }
}
