import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N];
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(N % 2 == 0 && num % 2 == 0) {
                System.out.println(0);
                return;
            }
            if(N % 2 != 0 && num % 2 != 0) {
                System.out.println(0);
                return;
            }
            count[num]++;
        }
        long answer = 1;
        int mod = 1000_000_007;
        for(int i = 1; i < N; i++) {
            if(count[i] != 2 && count[i] != 0) {
                System.out.println(0);
                return;
            }
            if(count[i] == 2) {
                answer *= 2;
                answer %= mod;
            }
        }
        System.out.println(answer);
    }
}

