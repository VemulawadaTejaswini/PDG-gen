import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static int k = 0;
    static int[] counters = new int[100000 + 1];

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            counters[a] += b;
        }

        int cnt = 0;
        for(int i = 1; ; ++i){
            cnt += counters[i];
            if(cnt >= k){
                System.out.println(i);
                return;
            }
        }
    }
}