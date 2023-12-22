import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);
            int k = Integer.parseInt(tmp[3]);
            
            br.close();
            
            PrintWriter pw = new PrintWriter(System.out);
            
            if (k <= a) {
                System.out.println(k);
            } else if (k <= a + b) {
                System.out.println(a);
            } else {
                System.out.println(a - (k - a - b));
            }
            
            pw.flush();
            
        }
    }
}