import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = reader.readLine();
        String[] vals = line.split(" ");
        Integer[] nums = { Integer.parseInt(vals[0]),
                Integer.parseInt(vals[1]), Integer.parseInt(vals[2]),
                Integer.parseInt(vals[3]), Integer.parseInt(vals[4]) };
        Arrays.sort(nums);
        out.println(String.format("%d %d %d %d %d", nums[4], nums[3], nums[2], nums[1], nums[0]));
    }
}