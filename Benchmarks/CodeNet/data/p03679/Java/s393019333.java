import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class Main {
        static BufferedReader jvin = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter jvout = new PrintWriter(System.out);

        public static void main(String[] args) throws IOException {
                Main instance = new Main();
                Main.passStaticVar();
        }

        public static void passStaticVar() throws IOException {
                int X, A, B;
                String l = jvin.readLine();
                String[] t = l.split(" ");
                X = Integer.parseInt(t[0]);
                A = Integer.parseInt(t[1]);
                B = Integer.parseInt(t[2]);

                if (A >= B)
                        jvout.write("delicious");
                else if (A+X >= B)
                        jvout.write("safe");
                else
                        jvout.write("dangerous");
                jvout.flush();
        }
}
