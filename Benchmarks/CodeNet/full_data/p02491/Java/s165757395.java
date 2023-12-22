import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] s = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int d = a/b;
            int r = a%b;
            float f = (float)a/ (float)b;

            System.out.println(d + " " + r + " " + f);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}