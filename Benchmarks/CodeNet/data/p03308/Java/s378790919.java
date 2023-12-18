import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            max = Math.max(max, A);
            min = Math.min(min, A);
        }
        
        System.out.println( max - min );
        
    }
}
