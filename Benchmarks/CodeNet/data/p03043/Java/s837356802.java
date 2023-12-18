import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double K = (double)sc.nextInt();

        sc.close();

        Fraction sum = new Fraction(0, 1);

        for(int i=1; i<=N; i++){
            int denominator = N;
            if(i < K){
                denominator *= (int)(Math.pow(2, Math.ceil(Math.log(K/i) / Math.log(2))));
            }
            //int denominator = (int)(Math.pow(2, Math.ceil(Math.log(K/i) / Math.log(2))) * N);
            System.err.println(denominator); //#############
            if (denominator == 0) continue;
            Fraction tmp = new Fraction(1, denominator);
            sum.addition(tmp);
        }

        System.err.println(sum.getNumerator());//#############
        System.err.println(sum.getDenominator());//#############
        double result = (double)sum.getNumerator() / (double)sum.getDenominator();
        System.out.println(result);
    }
}

//コピペ
// https://gist.github.com/namiken/363bc136d7a2f1809d6b
/**
 * 分数の値、および計算メソッドを保持するクラス。計算メソッドを利用すると自信の分数の値が書き換わる。(引数の値は書き換わりません)
 *
 */
class Fraction {
    /**
     *  分子
     */
    private long numerator;

    /**
     *  分母
     */
    private long denominator;

    /**分数を作る
     * @param numerator 分子
     * @param denominator 分母
     */
    public Fraction(int numerator, int denominator) {
        //分母がゼロならエラー
        if (denominator == 0) {
            throw new RuntimeException("denominator is not permission 'zero'");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        reduction();
    }

    /**
     * 約分を行う
     */
    private void reduction() {
        int gcdi = gcdi(numerator, denominator);
        numerator = numerator / gcdi;
        denominator = denominator / gcdi;
    }

    /**
     * 引数の分数を加える
     * @param fraction
     * @return
     */
    public void addition(Fraction fraction) {
        numerator = fraction.denominator * numerator + fraction.numerator * denominator;
        denominator *= fraction.denominator;

        reduction();
    }

    /**
     * 引数の分数を引く
     * @param fraction 引かれる数
     * @return
     */
    public void subtraction(Fraction fraction) {
        numerator = fraction.denominator * numerator - fraction.numerator * denominator;
        denominator *= fraction.denominator;

        reduction();
    }

    /**
     * 引数の分数を掛ける
     * @param fraction
     * @return
     */
    public void multiplication(Fraction fraction) {
        denominator *= fraction.denominator;
        numerator *= fraction.numerator;

        reduction();
    }

    /**
     * 引数の分数を割る
     * @param fraction 割られる数
     * @return
     */
    public void division(Fraction fraction) {
        denominator *= fraction.numerator;
        numerator *= fraction.denominator;

        reduction();
    }

    /**
     * 分子を返す
     * @return
     */
    public long getNumerator() {
        return numerator;
    }

    /**
     * 分母を返す
     * @return
     */
    public long getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        //分母が1のときは分子だけ返す
        if (denominator == 1) {
            return Long.toString(numerator);
        }
        return numerator + "/" + denominator;
    }

    /**
     * 最大公約数を求める
     * @param a
     * @param b
     * @return
     */
    private static int gcdi(long a, long b) {
        BigInteger gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        int result = gcd.intValue();
        System.err.println("GCD:" + result);
        return result;
    }
}