import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputLines[] = new String[2];
        inputLines[0] = bufferedReader.readLine();
        inputLines[1] = bufferedReader.readLine();

        int inputs[] = Arrays.stream(inputLines[0].split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        int votes[]  = Arrays.stream(inputLines[1].split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();

        int votesSum = Arrays.stream(votes).sum();
        int selectable = 0;
        for(String vote : votes){
            if(vote > votesSum * (1 / 4 * inputs[1])){
                selectable += 1;
            }
        }

        String result = "No";
        if(inputs[1] <= selectable){
            result = "Yes";
        }

        System.out.println(result);               
    }
}
