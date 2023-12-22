import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<String> inputs = new ArrayList<>();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int len = line.split(" ").length;
            if(len == 1) {
                if(!inputs.isEmpty()) {
                    output(inputs);
                    inputs.clear();
                }
                if("0".equals(line)) break;
            }
            if(len == 2) {
                inputs.add(line);
            }
        }
    }

    public static void output(List<String> inputs) {
        Integer scoreA = 0;
        Integer scoreB = 0;
        for(String line : inputs) {
            List<Integer> input = Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            int a = input.get(0);
            int b = input.get(1);
            if(a > b) {
                scoreA += ( a + b );
            } else if(a < b) {
                scoreB += ( a + b );
            } else {
                scoreA += a;
                scoreB += b;
            }
        }
        System.out.println(scoreA + " " + scoreB);
    }
}