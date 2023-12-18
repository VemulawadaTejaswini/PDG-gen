import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args) {
        //入力
        Scanner scan = new Scanner(System.in);
        String[] tmpmoney = scan.next().split("");
        ArrayList<Integer> mon = new ArrayList<Integer>();
        for (int i = tmpmoney.length - 1; i > -1; i--) {
            mon.add(Integer.parseInt(tmpmoney[i]));
        }
        int disnum = scan.nextInt();
        int[] num = new int[disnum];
        for (int i = 0; i < disnum; i++) {
            num[i] = scan.nextInt();
        }

        boolean ok = false;
        for (int i = 0; i < mon.size(); ) {
            /*--桁上がり--*/
            if (mon.get(i) == 10) {
                mon.set(i,0);
                if (i == mon.size() - 1) {
                    mon.add(1);
                } else {
                    mon.set(i + 1, mon.get(i + 1) + 1);
                }
            }

            //同じ数であれば+してbreak
            for (int j = 0; j < num.length; j++) {
                if (mon.get(i) == num[j]) {
                    mon.set(i, mon.get(i) + 1);
                    break;
                }

                if(j == num.length-1){
                    ok = true;
                    break;
                }
            }

            if (ok) {
                ok = false;
                i++;
            }
        }

        for (int i = mon.size()-1; i > -1; i--){
            System.out.print(mon.get(i));
        }
    }
}