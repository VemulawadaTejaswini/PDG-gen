import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
class AOJ1000 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        for(int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
            int res = 0;
            for(int i = 0; i < n; i++) {
                int min = Integer.MAX_VALUE;
                for(int j = 0; j < n; j++)
                    min = min(min, sc.nextInt());
                res = max(res, min);
            }
            System.out.println(res);
        }
    }
}
 
public class Main {
    public static void main(String...args) {
        new AOJ1000().run();
    }
}