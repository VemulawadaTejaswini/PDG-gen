import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        long prod = 1;
        long l = 1;
        boolean b = true;
        for(int i = 0; i < 18; i ++) l = l * 10;
        for(int i = 0; i < N; i++){
            A[i] = Long.parseLong(s.next());
            prod = prod * A[i];
            if(prod > l || l < 0)b = false;
        }
        if(!b || prod < 0 || prod > l) System.out.print(-1);
        else System.out.print(prod);
    }
}