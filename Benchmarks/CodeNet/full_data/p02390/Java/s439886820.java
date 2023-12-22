import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //時間の値を代入する
        int time = sc.nextInt();

        //時間、分、秒の計算する
        int h = time / 3600;
        int m = time % 3600 / 60;
        int s = time % 60 % 60;
        
        //時間、分、秒の値を表示する
        System.out.println(h + ":" + m + ":" + s);
    }
}

