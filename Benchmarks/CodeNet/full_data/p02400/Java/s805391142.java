import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r;
        
        r = scanner.nextDouble();
        
        System.out.println(String.format("%.6f",r*r*Math.PI) + " " + String.format("%.6f",2*r*Math.PI));
        
    }
}
