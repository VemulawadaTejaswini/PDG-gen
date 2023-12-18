
package exception_handling;

import static java.lang.Math.PI;
import java.util.Scanner;

public class circle {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double r , area;
        
        //System.out.print("Enter radious: ");
        r = input.nextDouble();
        
        area = 2*PI*r;
        System.out.println(area);
    }
}
