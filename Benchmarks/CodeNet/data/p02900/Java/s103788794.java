import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();

        int num = n;
        if(n>n2){
            num = n2;
        }

        // 高速バージョン
        num = (num - 3) / 2;
        int[] primeList = new int[num];
        for (int i = 0; i < num; i++) {
            primeList[i] = 1; // 1は素数扱いで管理する。（最初は全て素数として管理）
        }
        //System.out.println("PrimeNumber -> " + 2);
        int count = 2; // 2の分をカウント
        for (int i = 0; i < num; i++) {
            // primeList[i] == 0 の場合は素数ではないため演算しない
            if (primeList[i] == 1) {
                int primeNum = i + i + 3;
                // 遅くなるのでコメントアウト
                //System.out.println("PrimeNumber -> " + primeNum);

                if(n%primeNum ==0 && n2%primeNum==0) {
                    count++;
                }
                // 素数と判定した場合、素数を計算対象範囲（num)になるまで
                // 足しあげていき、素数ではない数値として判断する
                // これを行うことで、例えば、 3, 6, 9, 12 ... num
                // の数値に対して余分な演算を行わないようにしている
                for (int j = i + primeNum; j < num; j += primeNum) {
                    primeList[j] = 0;
                }
            }
        }


        System.out.println(count);


    }

}