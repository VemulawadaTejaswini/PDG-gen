import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String path = System.getProperty("user.dir");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String temp[] = line.split(" ");
        int arraySize = Integer.parseInt(temp[0]);
        int array[] = new int[arraySize];
        int sumOfArray = 0;
        line = br.readLine();
        temp = line.split(" ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(temp[i]);
            sumOfArray += array[i];
        }
        System.out.println();
        line = br.readLine();
        temp = line.split(" ");
        int inputSize = Integer.parseInt(temp[0]);
        int inputArray[][] = new int[inputSize][2];
        for (int i = 0; i < inputSize; i++) {
            line = br.readLine();
            temp = line.split(" ");
            inputArray[i][0] = Integer.parseInt(temp[0]);
            inputArray[i][1] = Integer.parseInt(temp[1]);
        }
        int indexingOfArray[] = new int[100001];
        for (int i = 0; i < arraySize; i++) {
            indexingOfArray[array[i]]++;
        }
        int output[] = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            int preValue = inputArray[i][0];
            int newValue = inputArray[i][1];
            int notOfTimesPreValueCome = indexingOfArray[preValue];
            indexingOfArray[preValue] = 0;
            indexingOfArray[newValue] = indexingOfArray[newValue] + notOfTimesPreValueCome;
            output[i] = sumOfArray - preValue * notOfTimesPreValueCome + newValue * notOfTimesPreValueCome;
            sumOfArray = output[i];
        }
        for (int element : output) {
            System.out.println(element);
        }

    }

}

