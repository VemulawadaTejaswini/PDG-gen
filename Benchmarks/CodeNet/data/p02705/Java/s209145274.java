import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircumCal {
    public static void main(String[] args){
        try {
            BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
            String input = bfreader.readLine();
            int radius = Integer.parseInt(input);
            System.out.println(radius*2*Math.PI);
            bfreader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}