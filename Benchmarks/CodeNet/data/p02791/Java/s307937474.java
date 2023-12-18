import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] Pi = null;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Pi = new int[N];
            for (int i = 0; i < N; i++) {
                Pi[i] = sc.nextInt();
            }
        }
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Pi.length; i++) {
            if(Pi[i] < min){
                result++;
                min = Pi[i];
            }
        }
        System.out.println(result);
    }
}
