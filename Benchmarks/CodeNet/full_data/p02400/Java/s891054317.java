import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double r = Double.parseDouble(s);
        //System.out.println(r);
        String x = String.format("%.6f",(r * r * Math.PI));
        String y = String.format("%.6f",( 2 * Math.PI *r));
        System.out.println(x+" "+y);
    }
}