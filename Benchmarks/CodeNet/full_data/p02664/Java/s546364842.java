import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        String[] temp = t.split("");

        String[] ans = new String[t.length()];
        String exa = "";

        for (int i = 0; i < t.length(); i++) {
            String flg = temp[i];
            if (!flg.equals("?")) {
                exa = flg;
            } else {
                if (i == 0) {
                    flg = "D";
                    exa = flg;
                    ans[i] = exa;
                    continue;
                }
                if (exa.equals("P")) {
                    exa = "D";
                } else {
                    exa = "P";
                }    
            }
            ans[i] = exa;
        }

        String answer = String.join("", ans);
        System.out.println(answer);
    }
}