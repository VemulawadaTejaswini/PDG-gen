import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int i = 1;

        while(true){
            String input = br.readLine();
            int x = Integer.parseInt(input);

            if (x == 0) {
                break;
            }
            output.append("case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(x)).append("\n");
        }
            System.out.println(output);
    }
}