import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
 
    public static void main(String[] args) {
        int a=0;
        int b=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String s=br.readLine();
            a=Integer.parseInt(s.substring(0,s.indexOf(" ")));
            b=Integer.parseInt(s.substring(s.indexOf(" ")+1,s.length()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print((int)a/b+" "+a%b+" "+(float)a/b);
    }
}