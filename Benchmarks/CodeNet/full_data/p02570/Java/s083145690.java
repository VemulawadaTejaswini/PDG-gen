import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4
{
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        if(Integer.parseInt(input[0])/Integer.parseInt(input[2]) > Integer.parseInt(input[1]))
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
        


    }
}
