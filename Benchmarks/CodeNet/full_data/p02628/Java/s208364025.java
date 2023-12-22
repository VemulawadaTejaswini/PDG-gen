import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(var br = new BufferedReader(new InputStreamReader(System.in))) {

            var nk = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            var list = new ArrayList<Integer>();
            for (int i = 0; i < nk[0]; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            System.out.println(list.get(0) + list.get(1) + list.get(2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}