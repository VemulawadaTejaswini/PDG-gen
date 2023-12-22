import java.util.Scanner;
public class Main{
    public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        //System.out.println(r*r*Math.PI + " " + 2*r*Math.PI);
        System.out.println(String.format("%.6f",r*r*Math.PI) + " " +String.format("%.6f",2*r*Math.PI));
    }
}
