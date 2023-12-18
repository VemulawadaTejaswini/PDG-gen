
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long sum = 0, a, b, x;
        int n = sc.nextInt();
        x = sc.nextLong();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (array[i] + array[i - 1] > x) {
                sum += (array[i] + array[i - 1]) - x;
                if (array[i] > x) {
                    array[i] = 0;
                }
            }
        }
        System.out.println(sum);
        bw.flush();
    }
}
