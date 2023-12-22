import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double dis = Math.hypot((y1 - x1), (y2 - x2));
        System.out.println(dis);
        
    }
}
