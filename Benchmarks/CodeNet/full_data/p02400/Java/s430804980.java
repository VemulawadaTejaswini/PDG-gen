import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    float r = scan.nextFloat();
    float pi = (float)3.141593;
    System.out.printf("%.6f ",r*r*pi);
    System.out.printf("%.6f\n",r*pi*2);


    }
}