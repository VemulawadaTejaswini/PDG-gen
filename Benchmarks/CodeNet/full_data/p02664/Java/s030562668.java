import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String t = sc.next();

        String[] temp = t.split("");

        String[] ans = new String[t.length()];
        String flg = "";

        // flgはひとつ前の文字列PかDかを保持
        // pointは判定文字を保持
        for (int i = 0; i < t.length(); i++) {
            String point = temp[i];
            if (!point.equals("?")) {
                flg = point;
            } else {
                if (i == 0) {
                    flg = "D";
                    flg = point;
                }
                if (i != t.length() -1) {
                    if (point.equals("P") && temp[i+1].equals("P")) {
                        flg = "D";
                    } else if (point.equals("P") && temp[i+1].equals("D")) {
                        flg = "D";
                    } else if (point.equals("D") && temp[i+1].equals("D")) {
                        flg = "P";
                    } else if (point.equals("D") && temp[i+1].equals("P")) {
                        flg = "D";
                    }    
                }
                if (i == t.length()) {
                    if (point.equals("P")) {
                        flg = "D";
                    } else if (point.equals("D")) {
                        flg = "D";
                    }    
                }
            }
            ans[i] = flg;
        }

        String answer = String.join("", ans);
        System.out.println(answer);
    }
}