import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     double r = scanner.nextInt();
     double s=r*r*Math.PI;
     double c=2*r*Math.PI;
       System.out.print(s+" "+c);
   }   
}