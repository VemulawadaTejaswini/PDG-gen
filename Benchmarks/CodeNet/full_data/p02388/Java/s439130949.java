import java.io.*;

public class Cubic {
    public static void main(String [] args) {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
             String line = reader.readLine();
             int x = Integer.parseInt(line);
             System.out.println(x * x * x);
    }
}

