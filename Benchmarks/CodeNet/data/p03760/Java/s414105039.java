
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        String O = Input.next();
        String E = Input.next();

        if (O.length() > E.length()) {
            String Ans = "";
            for (int I = 0; I < O.length(); I++) {
                if (I != O.length() - 1) {
                    Ans += O.charAt(I) + "";
                    Ans += E.charAt(I) + "";
                } else {
                    Ans += O.charAt(I) + "";
                }
            }
            System.out.println(Ans);
        } else {
            String Ans = "";
            for (int I = 0; I < O.length(); I++) {
                Ans += O.charAt(I) + "";
                Ans += E.charAt(I) + "";
            }
            System.out.println(Ans);
        }

    }
}//Keep Copying This Useless Code
