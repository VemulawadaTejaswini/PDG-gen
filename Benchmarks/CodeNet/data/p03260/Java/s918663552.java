import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] citiesPos = new int[N];

        for (int i = 0; i < N; i++) {
            citiesPos[i] = sc.nextInt();
        }

        Arrays.sort(citiesPos);
        int min = 1000000000;
        if (citiesPos.length == 1) {
            min = Math.abs(citiesPos[0] - X);
        }else {
            for (int cityPos : citiesPos) {
                min = Math.min(min, Math.abs(X - cityPos));
            }
        }

        boolean indivisibleFlg = false;
        for (int cityPos : citiesPos) {
            if (indivisibleFlg) {
                break;
            }
            if ((cityPos - X) % min != 0) {
                indivisibleFlg = true;
            }
        }

        if (indivisibleFlg) {
            int[] absDiffs = new int[citiesPos.length];
            for (int i = 0; i < citiesPos.length; i++) {
                absDiffs[i] = Math.abs(X - citiesPos[i]);
            }

            int ans = gcd(absDiffs[0], absDiffs[1]);
            if (absDiffs.length > 2) {
                for (int i = 2; i < absDiffs.length; i++) {
                    ans = gcd(ans, absDiffs[i]);
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(min);
        }
    }

    public static int gcd(int a, int b){
        int r = a % b;
        if (b % r != 0) {
            r = gcd(b,r);
        }
        return r;
    }
}