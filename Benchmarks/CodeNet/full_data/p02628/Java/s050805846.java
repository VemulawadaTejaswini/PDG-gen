
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int sum =0;

        int [] p =new int[N];

        for (int i = 0; i < N; i++) {
            p[i] = in.nextInt();
        }
        Arrays.sort(p);
        for (int i = 0; i < K; i++) {
            sum +=p[i];
        }
        System.out.println(sum);
    }
}
