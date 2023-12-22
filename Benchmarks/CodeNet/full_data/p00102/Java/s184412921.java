
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null || input.equals("0")) {
                break;
            }
            int inputCount = Integer.parseInt(input);
            String[] matrixInputList = new String[inputCount];
            for (int i = 0; i < inputCount; i++) {
                matrixInputList[i] = inputReader.readLine();
            }
            int[][] matrix = new int[inputCount + 1][inputCount + 1];
            for (int i = 0; i < matrixInputList.length; i++) {
                String[] temp = matrixInputList[i].split(" ");
                for (int j = 0; j < temp.length; j++) {
                    matrix[i][j] = Integer.parseInt(temp[j]);
                }
            }
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    matrix[inputCount][inputCount] += matrix[i][j];
                    matrix[i][inputCount] += matrix[i][j];
                    matrix[inputCount][j] += matrix[i][j];
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%5d", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}