import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextDouble();
        
        System.out.printf("%.10f %.10f",r*r*Math.PI, 2*Math.PI*r);
    }
}
