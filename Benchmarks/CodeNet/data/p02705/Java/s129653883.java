import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bit {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int r= Integer.parseInt(reader.readLine());
        System.out.println(2*Math.acos(-1)*r);
    }

}
