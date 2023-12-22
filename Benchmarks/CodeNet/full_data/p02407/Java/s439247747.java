import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            Scanner scanner = new Scanner(System.in);
            List<String> list = new ArrayList<>();  

            IntStream.range(0, n)
                    .forEach(i -> list.add(scanner.next()));

            Collections.reverse(list);

            String answer = String.join(" ", list);

            System.out.println(answer);
        }
    }
}