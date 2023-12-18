import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args) {
        //入力
        Scanner scan = new Scanner(System.in);
        String[] tmpstr = scan.next().split("");
        int[] money = new int[5];
        int tmpcnt = 0;
        for (int i = money.length-tmpstr.length; i < money.length; i++) {
            money[i] = Integer.parseInt(tmpstr[tmpcnt]);
            tmpcnt++;
        }

        int num = scan.nextInt();
        int[] hate = new int[num];
        for (int i = 0; i < hate.length; i++) {
            hate[i] = scan.nextInt();
        }


        boolean complate = false;
        boolean equ = false;
        boolean mbZero = true;
        while (!complate) {
            //後ろから追加していく
            for (int i = money.length-1; i > -1; i--) {
                for (int j = 0; j < hate.length; j++) {
                    if (money[i] == 10) {
                        money[i] = 0;
                        money[i - 1]++;
                        equ = true;
                        break;
                    }
                    if (money[i] == hate[j]) {
                        money[i]++;
                        equ = true;
                        break;
                    }
                }

                if (equ) {
                    break;
                }
            }
            if (!equ) {
                complate = true;
            } else {
                mbZero = true;
                equ = false;
            }
        }

        boolean zero = true;
        for (int tmp : money) {
            if (tmp == 0 && zero){
                continue;
            }else {
                zero = false;
            }
            System.out.print(tmp);
        }
    }
}