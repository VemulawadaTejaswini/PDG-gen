
import java.util.Scanner;
import java.io.PrintWriter;

public class A_Holiday {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        int ans = 0;
        if(s.equals("SUN")) ans = 7;
        else if(s.equals("MON")) ans = 6;
        else if(s.equals("TUE")) ans = 5;
        else if(s.equals("WED")) ans = 4;
        else if(s.equals("THU")) ans = 3;
        else if(s.equals("FRI")) ans = 2;
        else if(s.equals("SAT")) ans = 1;

        out.println(ans);



    }
}
