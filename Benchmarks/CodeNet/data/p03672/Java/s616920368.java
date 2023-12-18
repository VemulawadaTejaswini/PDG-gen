import java.util.Scanner;

public class Main {

    //バリデーション用メソッド
    static boolean isOK(String checkNum) { return checkNum.matches("[a-z]{1,200}");}
    static boolean notNull(Object o) { return o != null; }

    public static void main(String[] args) {

        //変数宣言
        String compareString="";
        String compareString2="";
        String checkString="";
        int half=0;

        //文字列を入力
        Scanner scanner_s = new Scanner(System.in);
        checkString = scanner_s.nextLine();

     
        //偶文字列確認処理
        while (checkString.length()!=1||checkString.length()%2==0) {
            //文字列の最後一文字を削除
            checkString = checkString.substring(0,checkString.length()-1);

            //使用する変数の作成
            half = (checkString.length() / 2);
            compareString = checkString.substring(0, half);
            compareString2 = checkString.substring(half);

                if (compareString.equals(compareString2)) {
                    System.out.println(checkString.length());
                    break;
                }
                
        }//while文終わり
    }
}









