import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wantUpper = 60000;
        int furui[] = new int[wantUpper + 1];

        for (int i = 2; i <= wantUpper; i++) {
            furui[i] = i;//篩に2~nまでの値を入れる
        }
        for (int i = 2; i <= Math.sqrt(wantUpper); i++) {
            for (int j = i + i; j <= wantUpper; j += i) {//iの倍数は篩落とす
                furui[j] = 0;
            }
        }
        int count = 0;
        int margin = 0;
        //篩の0ではない値が全て素数
        Random rnd = new Random();
        for (int i = 2; i < 60000 && count < n; i++) {
            if (furui[i] == i && margin-- < 0) {
                System.out.print(i + " ");
                count++;
                margin = rnd.nextInt(3);
            }
        }
    }
}