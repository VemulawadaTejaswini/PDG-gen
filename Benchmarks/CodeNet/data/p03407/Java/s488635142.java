import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
     int a;
     int b;
     int c;
     Scanner sc = new Scanner(System.in);


     a = sc.nextInt();


     b = sc.nextInt();


     c = sc.nextInt();

     if (a + b >= c)
        System.out.println("Yes");
     else
        System.out.println("No");


   }
 }
