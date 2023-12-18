import java.util.Scanner;

/**
 * A - Station and Bus
 * AtCoder 市には 3 つの駅があり、1,2,3 の番号がつけられています。
 * これらの駅は、それぞれ鉄道会社A, Bのいずれかが管理しています。
 * 管理状況は長さ3 の文字列S で表され、駅i は Si が A のとき鉄道会社 A が、B のとき鉄道会社 B が管理しています。
 * 鉄道会社 A が管理している駅と、鉄道会社 B が管理している駅の間には、交通の便のためにバスを運行することになりました。
 * 実際にバスが運行することになる駅の組み合わせが存在するかどうかを判定してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // モンスターの体力
        String s = sc.next();
        // AとB両方あればYes
        if( s.contains( "A" ) && s.contains( "B" ) ) {
            System.out.println( "Yes" );
        }
        else {
            System.out.println( "No" );
        }

        sc.close();
    }
}