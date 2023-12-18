import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        String S2 = new String();

        //Sの'01'と'10'を消去する
        S2 = remove10Or01(S);

        System.out.println(S.length() - S2.length());
    }

    //文字列中の01,10が無くなるまで繰り返す
    public static String remove10Or01 (String S) {

        if (!(S.contains("01") || S.contains("10"))) {

            return S;
        }

        return remove10Or01(S.replace("10", "").replace("01", ""));
    }
}
