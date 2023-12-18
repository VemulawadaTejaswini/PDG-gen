
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int count = 0;
        int n = sc.nextInt();
        for (i = 1;; i++) {
            count += i;
            if (count >= n) {
                break;
            }
        }
        System.out.println(i);
        bw.flush();
    }
}
