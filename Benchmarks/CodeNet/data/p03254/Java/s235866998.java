import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .sorted()
            .collect(Collectors.toList());
        int output = 0;    
        for (int num: list) {
            if (x >= num) {
                x -= num;
                output++;
            } else {
                break;
            }
        }
        if (list.size() == output && x > 0) {
            output--;
        }
        out.println(output);
        out.close();
    }
}