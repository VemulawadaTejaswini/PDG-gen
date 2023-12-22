import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String sStr = stdReader.readLine();

            String[] inputStr = sStr.split(" ");
            Integer input1 = Integer.valueOf(inputStr[0]);
            Integer input2 = Integer.valueOf(inputStr[1]);

            if (input1 > input2) {
                System.out.println(input1 + " > " + input2);
            } else if ( input1==input2) {
                System.out.println(input1 + " == " + input2);
            } else {
                System.out.println(input1 + " < " + input2);
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}