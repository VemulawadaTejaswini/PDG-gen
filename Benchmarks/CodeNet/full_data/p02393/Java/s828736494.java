
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arg = br.readLine();
        String[] inputArray = arg.split(" ");
        Integer[] inputIntArray = new Integer[inputArray.length];

        List<Integer> intList = Arrays.asList(inputIntArray);

        Collections.sort(intList);

        String retStr = intList.get(0) + " " + intList.get(1) + " " + intList.get(2);
        System.out.println(retStr);
    }
}