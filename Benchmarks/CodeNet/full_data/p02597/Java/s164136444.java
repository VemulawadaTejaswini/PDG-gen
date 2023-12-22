import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        char[] cr = s.toCharArray();
        int c = 0;

        if(s.indexOf("WR")<0){
            System.out.println(c);
            return;

        }


        for (int i = 0; i < s.length() - 1; i++) {
            if (cr[i] == 'W' && cr[i + 1] == 'R') {
                cr[i] = 'R';
                cr[String.valueOf(cr).lastIndexOf("R")] = 'W';
                c++;
            }

        }

        s = String.valueOf(cr);

        Pattern p = Pattern.compile("WR");
        Matcher m = p.matcher(s);
        while (m.find()) {
            int iw = s.indexOf("WR");
            if (iw >= 0) {
                cr[iw] = 'R';
                c++;
            }

            s = String.valueOf(cr);
            m = p.matcher(s);

        }


        System.out.println(c);


    }

}
