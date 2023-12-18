import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int g = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        
        out.println((100 * r + 10 * g + b) % 4 == 0 ? "YES" : "NO");
        out.close();
        
    }
}