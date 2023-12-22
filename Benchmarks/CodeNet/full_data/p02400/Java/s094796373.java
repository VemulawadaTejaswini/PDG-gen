import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       double r = scan.nextInt();
       double S = r*r*3.141592653589;
       double L = 2.0*r*3.141592653589;
       
       System.out.println(String.format("%8f", r*r*3.141592653589) + " " + String.format("%8f", 2.0*r*3.141592653589));
    }
}