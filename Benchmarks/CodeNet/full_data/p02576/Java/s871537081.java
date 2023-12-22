import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        try {

            String input = bufferedReader.readLine();
            String[] inputsArrays = input.split(" ");

            int N = Integer.parseInt(inputsArrays[0]);
            int X = Integer.parseInt(inputsArrays[1]);
            int T = Integer.parseInt(inputsArrays[2]);

            int timeTaken = 0;
            while (N>0){
                timeTaken += T;
                N -=  X;
            }
            System.out.println(timeTaken);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
