import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        sc.close();

        //硬貨の枚数
        int count500 = 0;
        int count5 = 0;
        //残高
        int remain = 0;
        //嬉しさ合計
        int happy500 = 0;
        int happy5 = 0;

        count500 = X / 500;
        happy500 = 1000 * count500;
        remain = X - (500 * count500);

        count5 = remain / 5;
        happy5 = 5 * count5;

        System.out.println(happy500 + happy5);

    }

}
