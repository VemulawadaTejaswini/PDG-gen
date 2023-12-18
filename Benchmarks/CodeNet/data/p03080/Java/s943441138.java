import java.io.*;
import java.nio.file.WatchEvent;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    private static int A, B, C;

    private static String solver(int length, String hats) {

        int redNum = length - hats.replace("R", "").length();

        if (redNum*2 > length) {
            return "Yes";
        } else {
            return "No";
        }
    }


    public static void main(String[] args) {

        int length = 0;
        String hats = "";
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            String[] inputArray = br.readLine().split(" ");
            length = Integer.parseInt(inputArray[0]);
            hats = br.readLine().split(" ")[0];
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver(length, hats));

    }
}