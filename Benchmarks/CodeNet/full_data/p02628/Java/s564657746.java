import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] foo = new int[N];
         for(int i = 0; i < N; i++) {
            foo[i] = s.nextInt();
        }
        
        int sum = 0; 
        Arrays.sort(foo);
        
        for(int i = 0; i < K;i++) {
            sum+= foo[i];
        }
        System.out.println(sum);
    }
}
