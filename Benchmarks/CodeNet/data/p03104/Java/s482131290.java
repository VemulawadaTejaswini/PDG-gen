import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    private static long solver(long a, long b) {

        long sum = a;
        for (long i = a; i < b; i++) {
            sum = sum ^ (i + 1);
        }
        return sum;
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        long a = 0;
        long b = 0;
        try {
            String[] inputArray = br.readLine().split(" ");
            a = Long.parseLong(inputArray[0]);
            b = Long.parseLong(inputArray[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver(a, b));

    }
}