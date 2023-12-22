import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String input = br.readLine();
        int n = Integer.parseInt(input);
        input = br.readLine();
        String[] strArray = input.split(" ");

        for(int i = n; i >= 1; i--){

            int x = Integer.parseInt(strArray[i-1]);
            output.append(x);

            if(i == 1){
                break;
            }
            output.append(" ");
        }
        output.append("\n");
        System.out.print(output);
    }
}