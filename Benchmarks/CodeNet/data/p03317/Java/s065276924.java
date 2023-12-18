import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 値の取得
        int n = sc.nextInt();	// 数列の最大値
        int k = sc.nextInt();	// 一度に操作する数

        String str = sc.nextLine();
        String[] target = sc.nextLine().split(" ");

        // 最小値(1)の位置を取得する
        int minNumPlace = 0;
        for (String item : target) {
        	int num = Integer.parseInt(item);
        	if (num == 1) { break; }
        	minNumPlace++;
        }

        // 必要な操作回数を取得する
        int numOfTimes = 0;
        int tmp = minNumPlace;
        while (tmp > 0) {
        	tmp -= (k-1);
        	numOfTimes++;
        }

        tmp = minNumPlace;
        while (tmp < target.length - 1) {
        	tmp += (k-1);
        	numOfTimes++;
        }

        // 出力
        System.out.println(numOfTimes);

    }
}