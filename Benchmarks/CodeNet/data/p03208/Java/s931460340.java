import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1;
        line1 = sc.nextLine();
        String[] k_n_s = line1.split(" ");
        int N = Integer.parseInt(k_n_s[0]);
        int K = Integer.parseInt(k_n_s[1]);
        long [] kn = new long[N+1];
        for (int i=1;i<=N;i++){
            kn[i] = Long.parseLong(sc.nextLine());
        }
        System.out.println("\n");
        Arrays.sort(kn);
        for (long k:kn){
          System.out.println(k);
        }
        Long min = 1000000000L;
        Long diff = 0L;
        for(int i=1;i<=N-K+1;i++){
            diff = kn[i+2]-kn[i];
            if (min > diff){
                min = diff;
            }
        }
        System.out.println("\n");
        System.out.println("min:");
        System.out.println(min);
    }
}
