import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        // 文字列の入力
        String today = sc.next();

        String tomorrow = null;
        switch ( today ) {
        case "Sunny":
            tomorrow = "Cloudy";
            break;
        case "Cloudy":
            tomorrow = "Rainy";
            break;
        case "Rainy":
            tomorrow = "Sunny";
            break;
        }

        // 出力
        System.out.println( "Tomorrow:" + tomorrow );
    }

}
