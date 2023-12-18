import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int blue = K;
        int red = N-K;

        for(int i=0; i<K; i++){
            // 無理な時
            if(red < i){
                System.out.println(0);
                continue;
            }

            // 真ん中のポイントの選び方
            int combPoint;
            if(i == 0){
                combPoint = 0;
            }else {
                combPoint = calcNumOfCombination(blue - 1, i);
            }

            int remainRed = red - i;

            // 重複あり個数

            if(combPoint == 0){
                System.out.println(calcNumOfCombination(2 + remainRed -1, remainRed));
            }else{
                int m = (i + 2) + remainRed - 1;
                int r = remainRed;
                int chouhukuComb = calcNumOfCombination(m, r);

                long tmp = (long)combPoint * (long)chouhukuComb;
                tmp %= (long)(1e9 + 7);
                System.out.println(tmp);
            }



        }


    }

    public static int calcNumOfCombination(int n, int r){
        long DIV = (long)1e9 + 7;
        r = Math.min(r, n - r);
        if (r == 1) {
            return n;
        }

        long sum = 1;
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - i + 1) / i;
            sum %= DIV;
        }
        return (int)sum;
    }
}