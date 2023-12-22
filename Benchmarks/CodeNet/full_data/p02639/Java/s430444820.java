import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in))) {
            var list = new ArrayList<Integer>();
            for (int i = 0; i <= 5; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            System.out.println(list.indexOf(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}