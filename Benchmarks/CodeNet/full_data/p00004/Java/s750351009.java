import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputStr;
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        while ((inputStr = bReader.readLine()) != null) {
            String[] editedStr = inputStr.split(" ");
            int a = Integer.parseInt(editedStr[0]);
            int b = Integer.parseInt(editedStr[1]);
            int c = Integer.parseInt(editedStr[2]);
            int d = Integer.parseInt(editedStr[3]);
            int e = Integer.parseInt(editedStr[4]);
            int f = Integer.parseInt(editedStr[5]);
            double x = (c*e-b*f)/(a*e-b*d);
            double y = (c-a*x)/b;
            System.out.println(String.format("%1.3g %1.3g",x , y));
        }
    }
}