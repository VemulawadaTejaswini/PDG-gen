import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputLines[] = { bufferedReader.readLine(),
                                bufferedReader.readLine() };

        int inputs[] = Arrays.stream(inputLines[0].split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();
        int votes[]  = Arrays.stream(inputLines[1].split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();

        int votesSum = Arrays.stream(votes).sum();
        int selectable = 0;
        double criteria = votesSum / (4 * inputs[1]);
        for(int vote : votes){
            if(vote > criteria){
                selectable += 1;
            }
        }

        if(inputs[1] <= selectable){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}