import java.io.*;
public class Main {
    public static void main(String args[]) {
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        try {
            int x = 0;
            int y = 0;
            String str = input.readLine();
            String str2 = input.readLine();
            x = Integer.parseInt(str.trim());
            y = Integer.parseInt(str2.trim());
            System.out.print(x*y);
            System.out.print(x*2 + y*2);
        } catch(IOException e) {
        }
    }
}