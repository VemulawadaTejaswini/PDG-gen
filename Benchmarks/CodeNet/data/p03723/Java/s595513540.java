
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {

          System.out.println(new Main().run(args, System.in));
    }
    public String run(String[] args, InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] val = reader.readLine().replaceAll("\\s+", " ").split(" ");

       long A = Long.parseLong(val[0]);
       long B = Long.parseLong(val[1]);
       long C = Long.parseLong(val[2]);
       if (A == B && B==C) return "-1";

      long count = 0;
       while (true) {
           if (A%2 == 1|| B%2 == 1 || C%2 == 1) {
               break;
           }           
           count++;
           long a2 = A / 2;
           long b2 = B / 2;
           long c2 = C / 2;
           if (a2+b2==C) {
               count = -1;
               break;
           }
           A = b2 + c2;
           B = a2 + c2;
           C = b2 + a2;
       }              
       return String.valueOf(count);
    }   
}
