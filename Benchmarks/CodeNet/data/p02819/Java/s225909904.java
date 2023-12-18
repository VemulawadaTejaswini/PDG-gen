import java.util.Scanner;

/*
ベルトラン・チェビシェフの定理
「任意の自然数 n に対して、n < p ≤ 2n を満たす素数 p が存在する」
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        for (int i = x; i < x * 2; i++) {
            if (IsPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    static boolean IsPrime(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n%2 == 0) return false;
        double sqrtNum = Math.sqrt(n);
        for (int i=3; i<=sqrtNum; i+=2) {
            if (n%i == 0) {return false;}
        }
        return true;
    }
}