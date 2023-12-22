import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minv = Integer.MAX_VALUE;
        int maxv = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            maxv = Math.max(j - minv, maxv);
            minv = Math.min(minv, j);
        }
        
        System.out.println(maxv);
    }
}
