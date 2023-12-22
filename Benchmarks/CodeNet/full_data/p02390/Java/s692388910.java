import java.io.*;
  
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int x = Integer.parseInt(input);
        int h = x / 3600;
        int m = (x % 3600) / 60;
        int s = (x % 3600) % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}