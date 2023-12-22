import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int r = scan.nextInt();
       double S = r*r*3.14;
       double L = 2*r*3.14;
       
       System.oout.println(String.format("%8f", S) + " " + String.format("%8f", L));
    }
}