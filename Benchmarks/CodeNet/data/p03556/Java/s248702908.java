import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        double n = Double.parseDouble(line);
        int i=(int) n;
        while(!isNumber(String.valueOf(Math.sqrt(i)))){
            i--;
        }
        System.out.println(i);
    }
    
    private static boolean isNumber(String str) {
        return str.substring(str.length()-1).equals("0");
    }
}
