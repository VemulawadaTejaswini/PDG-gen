import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int x1 = Integer.parseInt(line[0]);
        int y1 = Integer.parseInt(line[1]);
        int x2 = Integer.parseInt(line[0]);
        int y2 = Integer.parseInt(line[1]);
        int[] vec1 = {x2 - x1, y2 - y1};
        int[] vec2 = {-1 * vec1[1], vec1[0]};
        out.println(new StringBuilder()
            .append(x2 + vec2[0])
            .append(" ")
            .append(y2 + vec2[1])
            .append(" ")
            .append(x1 + vec2[0])
            .append(" ")
            .append(y1 + vec2[1])
            .toString());
        out.close();
    }
}