import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }
        String ans = nums[2] + " " + nums[0] + " " + nums[1];

        pw.println(ans);
        pw.flush();
    }
}
