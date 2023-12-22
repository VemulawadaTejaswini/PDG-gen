import java.util.Scanner;

/**
 * 問題A<BR>
 * 起床時刻と就寝時刻及び学習時間が与えられる。
 * 学習可能な時間を求めて出力してください。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 起床時刻
        int sh = sc.nextInt();
        int sm = sc.nextInt();
        // 就寝時刻
        int eh = sc.nextInt();
        int em = sc.nextInt();
        // 学習時間
        int k  = sc.nextInt();

        int study = (eh * 60 + em) - (sh * 60 + sm) - k;
        if (study < 0) {
            study = 0;
        }
        System.out.println(study);
    }
}