import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input M D
        // M = d1 * d10 なる積の日の日数を出力せよ
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();
        int dayNum = sc.nextInt();
        int resNum = 0;
        for(int j = 4; j <= monthNum; j++) {
            for (int i = 22; i <= dayNum; i++) {
                if (1 < i % 10 && ((i / 10) * (i % 10) == j)) {
                    resNum++;
                }
            }
        }
        System.out.println(resNum);
    }
}