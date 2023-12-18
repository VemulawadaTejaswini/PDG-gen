import java.util.Scanner;
 
public class Main {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
 System.out.print("Input first number: ");
  int num1 = in.nextInt();
  System.out.print("Input second number: ");
  int num2 = in.nextInt(); 
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
  int s;
 // int sum = num1 * num2  - num3;
   int sum ;
 // s =sum;  
  System.out.println(num1 * num2  - num3 );
  
  System.out.print("Input sum " );
  sum = in.nextInt();
  System.out.print("Input  number: ");
  int num4 = in.nextInt();
  System.out.print("Input  number: ");
  int num5 = in.nextInt();
 
  System.out.println( num4 * sum -num5  );
 }