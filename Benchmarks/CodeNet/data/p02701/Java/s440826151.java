import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long ans = IntStream.range(0, N).mapToObj(i -> sc.next()).distinct().count();
        out.println(ans);
        
        out.flush();
    }
}