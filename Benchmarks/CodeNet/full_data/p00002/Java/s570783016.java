import java.io.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] intArrayLef = new int[200];
        int[] intArrayRig = new int[200];

        String line;
        int num = 0;
        // データ読み込み
        while ((line = in.readLine()) != null && num < 200) {
            intArrayLef[num] = Integer.parseInt(line.split(" ")[0]);
            intArrayRig[num] = Integer.parseInt(line.split(" ")[1]);
            num++;
        }

        for (int i = 0; i < num; i++) {
            String res = String.valueOf(intArrayLef[i] + intArrayRig[i]);
            System.out.println(res.length());
        }
    }
}