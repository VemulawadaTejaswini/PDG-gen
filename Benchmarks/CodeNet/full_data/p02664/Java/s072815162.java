import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        String[] temp = t.split("");

        String ans = "";
        String exa = "";

        for (int i = 0; i < t.length(); i++) {
            String flg = temp[i];
            if (!flg.equals("?")) {
                ans += flg;
                exa = flg;
                continue;

            } else {
                if (i == 0) {
                    flg = "D";
                    exa = flg;
                    ans += flg;
                    continue;
                }
                if (exa.equals("P")) {
                    ans += "D";
                    exa = "D";
                } else {
                    ans += "P";
                    exa = "P";
                }
            }
        }

        System.out.println(ans);
    }
}