import java.util.Scanner;
import java.lang.Math;

class Main{
        public static void main(String args[]){
                Scanner scan=new Scanner(System.in);
                double r=scan.nextDouble();
                double s=r*r*Math.PI;
                double l=2*r*Math.PI;
                String ss=String.format("%.5f",s);
                String ll=String.format("%.5f",l);
                System.out.println(ss+" "+ll);
        }
}