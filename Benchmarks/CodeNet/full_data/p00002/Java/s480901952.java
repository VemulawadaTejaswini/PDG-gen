import java.io.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int num = 0;
        // データ読み込み
        while ((line = in.readLine()) != null && num < 200) {
            String res = String.valueOf(line.split(" ")[0] + line.split(" ")[1]);
            System.out.println(res.length());
            num++;
        }
    }
}