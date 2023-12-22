import java.util.Scanner;

class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();
        double x;
        double y;
        
        x = r * r * Math.PI;
        y = r * 2 * Math.PI;
        
        System.out.printf("%f %f\n",x,y);
       
       
        
    }
}






