
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var n1 = sc.nextInt();
        List<String> sList = new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            sList.add(sc.next());
        }

        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for (String s : sList){
            if (s.equals("AC")) {
                ac++;
            } else if (s.equals("WA")) {
                wa++;
            } else if (s.equals("TLE")) {
                tle++;
            } else if (s.equals("RE")) {
                re++;
            }
        }

        p("AC x " + ac);
        p("WA x " + wa);
        p("TLE x " + tle);
        p("RE x " + re);
    }

    static void p(String s) { System.out.println(s); }
}
