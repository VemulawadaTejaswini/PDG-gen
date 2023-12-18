import java.io.*;
import java.nio.file.WatchEvent;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    private static int HEIGHT;
    private static int WIDTH;
    private static int h, w;

    private static int solver() {

        return (HEIGHT * WIDTH)
                - (h*WIDTH)
                - (w*HEIGHT)
                + (h*w);

    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            String[] inputArray = br.readLine().split(" ");
            HEIGHT = Integer.parseInt(inputArray[0]);
            WIDTH = Integer.parseInt(inputArray[1]);
            inputArray = br.readLine().split(" ");
            h = Integer.parseInt(inputArray[0]);
            w = Integer.parseInt(inputArray[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver());

    }
}