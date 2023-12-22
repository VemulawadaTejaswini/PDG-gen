import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var s = scaner.next();
        var t = scaner.next();

        String ans = "Yes";

        if (!(s.equals(s.toLowerCase()) && t.equals(t.toLowerCase()))) {
            ans = "No";
        }

        var l = s.length();
        if (!(1 <= l && l <= 10)) {
            ans = "No";
        }

        if (!(l+1 == t.length())) {
            ans = "No";
        }

        var tt = t.substring(0, s.length());
        if (!s.equals(tt)) {
            ans = "No";
        }

        System.out.println(ans);
        scaner.close();
    }

}
