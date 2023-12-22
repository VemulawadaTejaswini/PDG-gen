import java.io.*;
import java.lang.Math;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[]str= br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        
        double circumference  = 2*a*Math.PI;
        double area = a*a*Math.PI;
        System.out.printf("%.6f %.6f",  area, circumference);
    }
}