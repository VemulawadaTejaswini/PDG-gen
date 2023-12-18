import java.util.Scanner;
import java.io.PrintWriter;

class Gayle1_1 {
    void solve(int testNumber, Scanner in, PrintWriter out) {
        String checkString = in.next();
        for (int ii=0;ii<checkString.length();ii++) {
            String chkchr = checkString.substring(ii,ii+1);
            if (checkString.indexOf(chkchr.charAt(0))!=ii) {
                out.print("exist");
                return;
            }
        }
        out.print("not exist");
        return;
    }
}
