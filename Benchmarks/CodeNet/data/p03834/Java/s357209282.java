import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = input.readLine().split(",");
        System.out.println(inputs[0] + " " + inputs[1] + " " +  inputs[2]);
    }
}
