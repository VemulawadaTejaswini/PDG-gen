import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int d = N/K;
        int r = N%K;
        int halfK = K%2 ==0 ? K/2 : 0;
        long ans = d*d*d;
        if(halfK != 0){
            if(halfK > r) ans += d*d*d;
            else ans += (d+1)*(d+1)*(d+1);
        }
        System.out.println(ans);

    }

}
