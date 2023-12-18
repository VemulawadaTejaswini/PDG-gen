import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

            int bSize = arrayB.size();
            if (bSize >= 2) {
                for (int i = 0; i < bSize; i++) {
                    int afterNum = bSize - 1 - i;

                    if (afterNum <= i) { break; }

                    String tmp = arrayB.get(i);
                    arrayB.set(i, arrayB.get(afterNum));
                    arrayB.set(afterNum, tmp);
                }
            }
        }

        String s = arrayB.toString();
        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replaceAll(", ", " ");
        System.out.println(s);
    }
}