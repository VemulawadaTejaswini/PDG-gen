import java.util.*;
public class Main{
    public static void main(String args[]) {
    //scanner型の変数sに入力文字を格納
       // System.out.println("1番目の入力してください");
        Scanner s = new Scanner(System.in);
        //System.out.println("2番目の入力してください");
        //Scanner s2 = new Scanner(System.in);
        //sをinteger型に変換
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());

        //System.out.println("掛け算の結果");
        System.out.println(a*b);

    }
}