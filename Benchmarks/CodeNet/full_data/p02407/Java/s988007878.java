import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        List<String> list;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            list = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
        }
        Collections.reverse(list);
        System.out.println(String.join(" ", list));
    }
}
