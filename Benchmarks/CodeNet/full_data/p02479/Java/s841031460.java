import java.util.Scanner;
public class Main{
        public static void main(String[] argv){
                Scanner scan=new Scanner(System.in);
                double r=scan.nextDouble();
                double pi=Math.PI;
                double area=pi*r*r;
                double length=2*pi*r;
                System.out.println(area+" "+length);
        }
}