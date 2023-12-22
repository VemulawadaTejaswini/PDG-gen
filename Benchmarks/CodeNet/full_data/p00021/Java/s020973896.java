import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str_array=br.readLine().split(" ");
            double[] data = new double[8];
            for (int j = 0; j < 8; j++) {
                data[j] = Double.parseDouble(str_array[i]);
            }
            if ((data[3] - data[1]) / (data[2] - data[0]) == (data[7] - data[5]) / (data[6] - data[4])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}