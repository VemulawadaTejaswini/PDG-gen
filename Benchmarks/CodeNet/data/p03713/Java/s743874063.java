import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = reader.readLine().split(" ");
        int h = Integer.valueOf(values[0]);
        int w = Integer.valueOf(values[1]);


        if (h % 3 == 0 || w % 3 == 0) {
            System.out.print(0);
            return;
        }

        long WH = w*h;

        if (h % 2 == 0 || w % 2 != 0) {
            long area1 = (w / 2 + 1) * h * 3 / 2;
            long area2 = (w / 2 - 1) * h * 3 / 2;
            long min = Math.abs(area1 - WH);
            if (Math.abs(area2 - WH) < min) {
                min = Math.abs(area2 - WH);
            }
            System.out.print(min);
            return;
        } else if (h % 2 != 0 || w % 2 == 0) {
            long area1 = (h / 2 + 1) * w * 3 / 2;
            long area2 = (h / 2 - 1) * w * 3 / 2;
            long min = Math.abs(area1 - WH);
            if (Math.abs(area2 - WH) < min) {
                min = Math.abs(area2 - WH);
            }
            System.out.print(min);
            return;
        }


//        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
//        writer.close();

    }
}
