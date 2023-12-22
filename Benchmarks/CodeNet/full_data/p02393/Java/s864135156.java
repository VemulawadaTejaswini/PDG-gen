import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        List<String> lists = Arrays.asList(br.readLine().split(" "));
        System.out.println(lists.stream().sorted(Comparator.naturalOrder())
            .collect(Collectors.joining(" ")));
    }
}