
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //標準入力
       Scanner sc = new Scanner(System.in);

       //変数
        //System.out.println("速度を入力してください(分)");
       int speed = sc.nextInt();
       //System.out.println("距離を入力してください(メートル)");
       int distance = sc.nextInt();
       //System.out.println("時間を入力してください(分)");
       int time = sc.nextInt();

       //入力された変数の値を表示
//       System.out.println("入力された速度は" + speed + "メートル(分)です");
//       System.out.println("入力された距離は" + distance + "(メートル)です");
//       System.out.println("入力された指定の時間は" + time + "(分)です");

       //入力された情報をもとに時間を計算する　※　時間＝　距離÷速さ
        int totalTime = distance / speed;
//        System.out.println("必要な時間は" + totalTime + "分です");

        //計算結果をもとに時間内にたどり着けるのか表示する


        //デモ用
//        if (time < totalTime){
//            System.out.println("間に合いません");
//        }else if(time == totalTime){
//            System.out.println("時間ぴったりです");
//        }else if (time > totalTime){
//            System.out.println("十分間に合います");
//        }
        //Atcorder用
        if (time >= totalTime){
            System.out.println("Yes");
        }else if (time < totalTime){
            System.out.println("no");
        }
    }
}
