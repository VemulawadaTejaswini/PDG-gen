import java.util.*;

// 問題
// https://atcoder.jp/contests/abc143/tasks/abc143_b

class Animals {

    // 個体数
    public static int num;
    // 足の数
    public static int leg_num;

    static String isOK(){
        if ( leg_num >= 2 * num & leg_num <= 4 * num &
                leg_num % 2 == 0){ return "Yes";}
        return "No";
    }

}

public class Main {
    public static void main(String... args){

        // 入力の受け取り
        Scanner scanner = new Scanner(System.in);

        Animals.num = scanner.nextInt();
        Animals.leg_num = scanner.nextInt();


        System.out.println(Animals.isOK());

    }
}
