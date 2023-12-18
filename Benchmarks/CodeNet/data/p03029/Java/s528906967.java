import java.util.Scanner;
//Scannerクラスをimport
class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //Scannerクラスのインスタンスを作成
        int A = sc.nextInt();
        //りんご
        int P = sc.nextInt();
        //りんごの欠片
        System.out.println((3 * A + P) / 2 );
        //計算(頭の中ではわかっているけど、言葉では表せない処理)
    }
}