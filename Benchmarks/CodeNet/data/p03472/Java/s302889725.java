import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        Integer[] Az = new Integer[N];
        Integer[] Bz = new Integer[N];
        for (int n = 0; n < N; n++){
            Az[n] = sc.nextInt();
            Bz[n] = sc.nextInt();
        }
        Arrays.sort(Az, Comparator.reverseOrder());
        Arrays.sort(Bz, Comparator.reverseOrder());

        int max = 0;
        for (int n = 0; n < N; n++){
            if (max < Az[n]) max = Az[n];
        }

        int throwNum = N;
//        System.out.println("========\n");
        for (int n = 0; n < N; n++){
//            System.out.println(Az[n]+" "+Bz[n]);
            if (max > Bz[n]){
                throwNum = n;
                break;
            }
        }
//        System.out.println("thrownum>>"+ throwNum);
        int ans = 0;
        for (int n = 0; n < throwNum; n++){
            H -= Bz[n];
            ans = n + 1;
            if (H <= 0) {
                System.out.println(ans);
                System.exit(0);
            }
        }
//        System.out.println("H>>"+H+" ans>> "+ans);
        while(H > 0){
            H -= max;
            ans++;
        }
        System.out.println(ans);
    }
}