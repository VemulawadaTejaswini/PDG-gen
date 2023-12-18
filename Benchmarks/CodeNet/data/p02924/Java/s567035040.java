import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N
        // 整数 N に対して 1,2,...,N を入れ替えた P1,P2,...PN なる数列を選ぶ
        // P1 % 1 + P2 % 2 + ... PN % N の最大値を出力せよ
        // N = 13 の場合、 ANS = 78
        // 13 1 2 3 4 5 6 7 8 9 10 11 12
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int retNum = 0;
        if(numN > 1){
            double subN = numN - 1;
            retNum = (int)((subN + 1) * subN / 2.0);
        }
        System.out.println(retNum);
    }
}
