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
        int tmpcnt = tmpstr.length - 1;
        for (int i = 0; i < money.length; i++) {
            money[i] = Integer.parseInt(tmpstr[tmpcnt]);
            if (tmpcnt == 0) {
                break;
            } else {
                tmpcnt--;
            }
        }

        int num = scan.nextInt();
        int[] hate = new int[num];
        for (int i = 0; i < hate.length; i++) {
            hate[i] = scan.nextInt();
        }
        
        boolean cf = false;
        for (int i = 0; i < money.length; ) {
            for (int j = 0; j < hate.length; j++) {
                if (money[i] == 10) {
                    money[i] = 0;
                    money[i + 1]++;
                    if (i == tmpstr.length-1)cf = true;
                    break;
                }
                if (money[i] == hate[j]) {
                    money[i]++;
                    break;
                }
            }
            i++;
        }
        
        int maxF = 0;
        if (cf){
            maxF = tmpstr.length;
        }else {
            maxF = tmpstr.length-1;
        }
        for (int i = maxF; i > -1; i--) {
            System.out.print(money[i]);
        }
    }
}