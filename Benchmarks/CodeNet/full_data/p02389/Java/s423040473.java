import java.util.Scanner;
class Main{
 public static void main(String [] args){ 
  int a;
  int b;  
  Scanner data1 = new Scanner(System.in);
  a = data1.nextInt();
  Scanner data2 = new Scanner(System.in);
  b = data2.nextInt();

  int area = (a * b);
  int total = ((a + b) * 2);
  System.out.println(area + " " + total );
 }
}