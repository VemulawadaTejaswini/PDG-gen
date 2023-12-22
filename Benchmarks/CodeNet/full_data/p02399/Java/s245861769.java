
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String data = reader.readLine();
        String[] number = data.split(" ");
        builder
           .append(Integer.parseInt(number[0]) / Integer.parseInt(number[1]))
           .append(" ")
           .append(Integer.parseInt(number[0]) % Integer.parseInt(number[1]))
           .append(" ")
           .append(Float.parseFloat(number[0]) / Float.parseFloat(number[1]))
           .append("\n");
        System.out.print(builder);
    }        
}