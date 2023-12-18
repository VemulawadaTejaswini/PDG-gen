import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        final Scanner sc=new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] sunuke = new int[N];
        int d, tmp;
        int cnt = N;

        Arrays.fill(sunuke, 0);

        for (int i = 0; i < K; i++) {
            d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                tmp = Integer.parseInt(sc.next()) - 1;
                if (sunuke[tmp] == 0) {
                    cnt--;
                }
                sunuke[tmp]++;
            }
        }

        System.out.print(cnt);
    }
}