import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        long a = in.nextLong();
        long b = in.nextLong();
        long x= in.nextLong();
        long s=0;
        long first = (a+x-1)/x;
        if (first<=b)
            s++;
        long scope = b-(first*x);
        if (scope>=0)
            System.out.println(s+scope/x);
        else
            System.out.println(0);
    }
}