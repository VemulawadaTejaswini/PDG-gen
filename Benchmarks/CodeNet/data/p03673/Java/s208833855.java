import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        // 数列A
        String[] arrayA = br.readLine().split(" ");

        // 数列B
        List<String> arrayB = new ArrayList<>();

        for (String a : arrayA) {
            arrayB.add(a);

            if (arrayB.size() >= 2) {
                Collections.reverse(arrayB);
            }
        }

        StringJoiner j = new StringJoiner(" ");
        for (String b : arrayB) {
            j.add(b);
        }

        System.out.println(j.toString());
    }
}