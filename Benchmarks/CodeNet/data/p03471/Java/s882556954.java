import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int paramN = sc.nextInt();
        int paramY = sc.nextInt();
        System.out.println(judgeOtoshidama(paramN, paramY));
        sc.close();
    }

    public static String judgeOtoshidama(int N, int Y){
        for(int cnt10=0; cnt10<=N; cnt10++){
            for(int cnt5=0; cnt5<=N-cnt10; cnt5++){
                int cnt1 = N - (cnt10 + cnt5);
                if(Y == (cnt10 * 10000 + cnt5 * 5000 + cnt1 * 1000)){
                    return cnt10 + " " + cnt5 + " " + cnt1;
                }
            }
        }
        return "-1 -1 -1";
    }
}