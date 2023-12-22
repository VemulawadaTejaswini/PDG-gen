import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String inputData[] = br.readLine().split(" ");
            int sum = 0;
            int row = Integer.parseInt(inputData[0]), column = Integer.parseInt(inputData[1]);
            String data[][] = new String[row][column];
            String data2[] = new String[column];
            // data
            for (int i = 0; i < row; i++) {
                data[i] = br.readLine().split(" ");
            }
            // data2
            for (int i = 0; i < column; i++)
                data2[i] = br.readLine();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sum = sum + Integer.parseInt(data[i][j]) * Integer.parseInt(data2[j]);
                }
                System.out.printf("%d\n", sum);
                sum = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
