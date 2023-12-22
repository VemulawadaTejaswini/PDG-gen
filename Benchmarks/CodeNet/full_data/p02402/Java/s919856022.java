import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            List<Integer> list = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

            int min = list.get(0);
            int max = list.get(list.size() - 1);
            int sum = list.stream().mapToInt(Integer::intValue).sum();

            System.out.println(min + " " + max + " " + sum);
        }
    }
}