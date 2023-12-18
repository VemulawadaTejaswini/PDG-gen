import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_152_C();

        return;
    }

    private static void solve_152_C() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P[] = new int[N];
        int count = 0;
        Boolean judge = false;

        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
        }
        int max = P[0];

        for(int i=0; i<N; i++) {
            int value = P[i];
            if(value <= max) count++;
            max = Math.min(max,value);
        }
        System.out.println(count);
    }
}