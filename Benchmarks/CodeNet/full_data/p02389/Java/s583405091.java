import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
  int a;
  int b;
  Scanner sc = new Scanner(System.in);
  a = sc.nextInt();
  b = sc.nextInt();
 
  int area = a*b;
  int syu = 2*(a+b);
   
  System.out.println(area+" "+syu);
 }
}