import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.DoubleToIntFunction;

public class Main2 {
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

        double r = Double.parseDouble(scList.pop());
        System.out.println(r*Math.PI*2);
    }
}