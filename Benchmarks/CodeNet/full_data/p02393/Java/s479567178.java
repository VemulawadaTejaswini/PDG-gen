import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        List<String> lists = Arrays.asList(br.readLine().split(" "));
        lists.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(String.join(" ", lists));
    }
}