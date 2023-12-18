import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
	    String[] inputs = Io.read();
	    int size = Integer.parseInt(inputs[0]);

	    int[] nums = parse(size, inputs[1]);

	    Calculator calc = new Calculator();
        Io.write(calc.calc(nums));
    }

    private static int[] parse(int size, String numStr) {
        int[] result = new int[size];
        String[] nums = numStr.split(" ");
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}

class Calculator {
    final private int minLim = -100;
    final private int maxLim = 100;

    public int calc(int[] nums) {
        int cost = Integer.MAX_VALUE;
        int tmpCost = 0;
        for (int i = minLim; i <= maxLim; i++) {
            tmpCost = calcCost(i, nums);
            if (tmpCost <= cost) {
                cost = tmpCost;
            }
        }

        return cost;
    }

    private int calcCost(final int target, int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.map(x -> (x - target) * (x - target)).sum();
    }
}

class Io {

    /**
     * 標準入力から1行ずつ受け取る
     * @return
     * @throws IOException
     */
    public static String[] read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(""))
                break;

            inputs.add(line);
        }
        br.close();
        return inputs.toArray(new String[0]);
    }

    /**
     * 標準出力
     * @param line
     */
    public static void write(int line)
    {
        System.out.println(line);
    }
}