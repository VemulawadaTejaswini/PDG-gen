import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String str = br.readLine();
        int x = Integer.parseInt(str);

        x = x*x*x;

        System.out.println(x);

    }

}