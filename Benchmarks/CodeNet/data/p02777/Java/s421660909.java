import java.io.*;

public class Main {
    public static void main (String[] args) throws Exception {
        String s;

        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));

        s = reader.readLine();

        String[] sl    = s.split (" ");
        final String S = sl[0];
        final String T = sl[1];

        s     = reader.readLine();
        sl    = s.split (" ");
        int A = Integer.parseInt (sl[0]);
        int B = Integer.parseInt (sl[1]);

        final String U = reader.readLine();

        if (S.equals (U)) {
            A--;
        } else {
            B--;
        }

        PrintWriter out = new PrintWriter (System.out);
        out.println (A + " " + B);

        out.flush();
    }
}