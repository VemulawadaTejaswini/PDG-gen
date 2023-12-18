import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        for(int i=1; i<=N; i++) {
            if(i%2 == 1) {
                int num=0;
                for(int j=1; j<=N; j++) {
                    if(i%j == 0) num++;
                }
                if(num==8) ans++;
            }
        }

        System.out.println(ans);
    }
}
