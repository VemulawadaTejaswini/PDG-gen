import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        int xdiff = x2 - x1;
        int ydiff = y2 - y1;
        
        if(xdiff >= 0){
            int x3 = x2 - ydiff;
            int y3 = y2 + xdiff;
            int x4 = x3 - xdiff;
            int y4 = y3 - ydiff;
            
            System.out.println(x3+ " "+y3+" "+x4+" "+y4);
        }
        else{
            int x3 = x2 - ydiff;
            int y3 = y2 + xdiff;
            int x4 = x3 - xdiff;
            int y4 = y3 - ydiff;
            
            System.out.println(x3+ " "+y3+" "+x4+" "+y4);
        }
        
    }
}
