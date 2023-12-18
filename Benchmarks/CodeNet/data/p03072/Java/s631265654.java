import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] H = new int[N];
        
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        
        int maxH = 0;
        int count = 1;
        for(int i = 1; i < N; i++){
            maxH = Math.max(maxH, H[i-1]);
            if(maxH <= H[i]) count++;
        }
        
        System.out.println(count);
    }
}
