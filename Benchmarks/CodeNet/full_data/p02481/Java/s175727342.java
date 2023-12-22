import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String tate = br.readLine();
        int x = Integer.parseInt(tate);
        String yoko = br.readLine();
        int y = Integer.parseInt(yoko);
        System.out.println((x * y) + " " + (x * 2 + y * 2));
    }
}