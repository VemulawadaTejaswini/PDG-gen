import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        double r = scanner.nextDouble();
        double a = r*r*Math.PI ;
        double b = 2*r*Math.PI ;
        System.out.printf("%f %f",a,b);
    }
}
