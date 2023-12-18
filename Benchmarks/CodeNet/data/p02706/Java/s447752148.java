import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        // Listに標準入力の値を取得
        LinkedList<String> scList = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (br.ready()) {
                String[] lineArray = br.readLine().split(" ");
                Arrays.<String>stream(lineArray).forEach(s -> scList.add(s.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = Integer.parseInt(scList.pop());
        scList.pop();

        for (String day :
                scList) {
            n = n - Integer.parseInt(day);
        }

        if (n >= 0) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }
    }
}