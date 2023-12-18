import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int total = 0;
        if (n > 1) {
            total += (n * (n-1) / 2);
        }
        if (m > 1) {
            total += (m * (m-1) / 2);
        }
        System.out.println(total);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write("\n");
//        bw.close();
    }

}