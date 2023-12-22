import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
    double x1 = kbd.nextDouble();
    double y1 = kbd.nextDouble();
    double x2 = kbd.nextDouble();
    double y2 = kbd.nextDouble();
    double d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    d = Math.sqrt(d);
    System.out.println(d);
    }
}