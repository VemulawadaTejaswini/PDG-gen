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
        for(int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }
        String ans = nums[3] + " " + nums[1] + " " + nums[2];

        pw.println(ans);
        pw.flush();
    }
}