import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] sides = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) sides[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(sides);
        int total = 0;
        for (int i = 0; i < sides.length; ++i) {
            for (int j = i + 1; j < sides.length; ++j) {
                for (int k = j + 1; k < sides.length; ++k) {
                    if (sides[i] + sides[j] > sides[k] && sides[i] != sides[j] && sides[j] != sides[k] && sides[i] != sides[k]) {
                        ++total;
                    }
                }
            }
        }
        pw.println(total);
        pw.close();
    }
}