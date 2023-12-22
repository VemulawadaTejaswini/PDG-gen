import java.io.IOException; //例外処理
import java.util.Scanner;





public class Main {

	public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        //Stringのsplitは、文字列を指定した区切り文字列で分割して、Stringの配列とするメソッドです。
        //ポイントは、区切り文字列を「正規表現」と呼ばれるパターンで指定できるという所です

        System.out.println(isInCircleRect(inputNums));
    }
    private static String isInCircleRect(String[] inputNums) throws IOException {
        int W = Integer.parseInt(inputNums[0]);
        int H = Integer.parseInt(inputNums[1]);
        int x = Integer.parseInt(inputNums[2]);
        int y = Integer.parseInt(inputNums[3]);
        int r = Integer.parseInt(inputNums[4]);

        //Integer.parseIntはString型をint型に変換する

        if ((-100 <= x && x <= 100) && (-100 <= y && y <= 100)
            && (
                (0 < W && W <= 100) && (0 < H && H <= 100) && (0 < r && r <= 100)
                )
            ) {
            if (0 <= x + r  && x + r <= W && 0 <= y + r && y + r <= H) {
                return "Yes";

                //&&はかつ、またはの意味

            }
        } else {
            throw new IOException();
        }
        return "No";

        //Syste.out.printとreturnは意味合いが違う出力？
        //後で上の二つの違いを調べる

    }
}

