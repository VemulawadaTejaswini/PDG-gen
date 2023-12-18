
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost = 0, sum = 0;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        if (sum % 2 != 0) {
            sum = sum / n + 1;
        } else {
            sum = sum / n;
        }
        for (int i = 0; i < n; i++) {
            cost += ((array[i] - sum) * (array[i] - sum));
        }
        System.out.println(cost);
        bw.flush();
    }
}
