import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long cnt = 0;
        for(int i=1;i<=N;i++) {
            int a = (N-1)/i;
            cnt+=a;
        }
        System.out.println(cnt);
    }
}