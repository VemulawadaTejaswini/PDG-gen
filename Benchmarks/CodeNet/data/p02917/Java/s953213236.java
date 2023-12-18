import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] b = new int[N-1];
        int sum = 0;
        for(int i = 0; i < N-1; i++) {
            b[i] = sc.nextInt();
        }
        sum += b[0];
        for(int i = 1; i < N-1; i++) {
            sum += min(b[i-1], b[i]);
        }
        
        sum += b[N-2];

        System.out.println(sum);

    }
    
    public static int min(int x, int y) {
        if(x < y) {
            return x;
        }else {
            return y;
        }
    }
}
