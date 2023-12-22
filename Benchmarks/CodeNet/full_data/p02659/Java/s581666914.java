import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer s = new StringTokenizer(in.readLine());
        long a = Long.parseLong(s.nextToken());
        double b = Double.parseDouble(s.nextToken());
        int c = (int)(b * 100);
        long result = a * c / 100;

        System.out.println(result);
    }
}