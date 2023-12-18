import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        int S;
        S = sc.nextInt();

        int Sleng = String.valueOf(S).length();

        // 2019の倍数の数
        int n = 0;

        // 4桁のとき
        if (Sleng == 4) {
            if (S % 2019 == 0) {
                n++;
            }
        }
        // 5桁のとき
        else if (Sleng == 5) {
            // 切り分ける
            int FiveSA = kiriwake(S, 0, 4);
            int FiveSB = kiriwake(S, 1, 5);
            int FiveSC = kiriwake(S, 0, 5);
            int FiveArr[] = { FiveSA, FiveSB, FiveSC };

            for (int i = 0; i < FiveArr.length; i++) {
                if(FiveArr[i]%2019==0){
                n++;
            }
            }
        } else if (Sleng == 6) {
            // 切り分ける
            int SixSA = kiriwake(S, 0, 4);
            int SixSB = kiriwake(S, 1, 5);
            int SixSC = kiriwake(S, 2, 6);
            int SixSD = kiriwake(S, 0, 5);
            int SixSE = kiriwake(S, 1, 6);
            int SixSF = kiriwake(S, 0, 6);
            int SixArr[] = {SixSA,SixSB,SixSC,SixSD,SixSE,SixSF};
            for (int i = 0; i < SixArr.length; i++) {
                if(SixArr[i]%2019==0){
                    n++;
                }
            }
        }
    System.out.println(n);
    }

        public static int kiriwake(int beforeS, int a, int b) {
        String afterS = Integer.toString(beforeS);
        afterS = afterS.substring(a, b);
        return Integer.parseInt(afterS);
    }
}