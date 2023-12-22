import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<String> inputs = new ArrayList<>();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int len = line.split(" ").length;
            if(len != 1) {
                inputs.add(line);
            }
        }
        output(inputs); //最後に出力する場合
    }

    public static void output(List<String> inputs) {
        inputs.stream().forEach(line->{
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(yesNo(numbers.get(0), numbers.get(1), numbers.get(2)));
        });
    }

    public static String yesNo(int a, int b, int c) {
        if(a * a + b * b == c * c || a * a == b * b + c * c || b * b == a * a + c * c) return "YES";
        else return "NO";
    }
}
