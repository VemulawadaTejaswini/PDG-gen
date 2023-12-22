import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	double pi = Math.PI;
	double area = r*r*pi;
	double length =2*pi*r;
        System.out.printf("%f %f",area,length);
    }
}