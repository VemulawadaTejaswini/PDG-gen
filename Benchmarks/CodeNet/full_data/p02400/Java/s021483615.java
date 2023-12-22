import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
     double r,pi,s,l;
     Scanner sc = new Scanner(System.in); 
         r =   sc.nextDouble();
     pi = Math.PI;
     s = r*r*pi;
     l = 2*r*pi;
     System.out.printf("%f %f\n",s,l);
    }
}
