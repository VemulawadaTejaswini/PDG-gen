import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        double a = in.nextInt();
        double b = in.nextInt();
        double h = in.nextInt();
        int ans = (int)(((a+b)/2)*h);
        System.out.println(ans);
    }
}
