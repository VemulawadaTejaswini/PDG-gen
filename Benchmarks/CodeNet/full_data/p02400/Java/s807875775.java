import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        double area=Math.PI*r*r;
        double lap=2*Math.PI*r;
        System.out.printf("%f %f",area,lap);
    }
}
