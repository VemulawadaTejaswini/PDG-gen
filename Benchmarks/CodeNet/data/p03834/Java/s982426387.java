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
        HashMap<Integer,Integer> mem = new HashMap<>();
        String[]s = in.next().split(",");
        for (String v: s){
            System.out.print(v+" ");
        }
    }
}
