import java.io.*;
import java.lang.Math;
import java.util.*;
public class Main{
    public static void main (String[]args) throws IOException{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");

        long x = Long.parseLong(strs[0]);
        double q = Double.parseDouble(strs[1]);
        System.out.println((long)(x*q));
    }
}