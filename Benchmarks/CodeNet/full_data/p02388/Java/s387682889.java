import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_1_B {

    public static void main(String args[]) {
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while ((line = bufferedReader.readLine()) != null) {
                double volume =  Math.pow((double)Integer.parseInt(line), 3d);
                System.out.println((int)volume);
            }


        } catch (IOException e) {

        }
    }
}

