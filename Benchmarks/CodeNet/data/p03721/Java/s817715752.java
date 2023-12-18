import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] counters = new int[100005];

        for(int i = 0; i < n; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            counters[a] += b;
        }

        long cnt = 0;
        for(int i = 1; i <= 100000; ++i){
            cnt = cnt + counters[i];
            if(cnt >= (long)k){
                System.out.println(i);
                return;
            }
        }
    }
}