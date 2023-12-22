import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        System.out.printf("%.10f %.10f",Math.PI*r*r,2*Math.PI*r);
    }
}
