import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double x = x2 - x1;
        double y = y2 - y1;
        
        System.out.println(Math.sqrt(x * x + y * y));
    }
}
