import java.util.Scanner;
import java.util.Arrays;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
int N = scan.nextInt();
int A = scan.nextInt();
int B = scan.nextInt(); 
int amari = 0;
int blue = 0;
int a = N / (A + B);
 amari = N % (A + B);
  if(amari > A){
    blue = A * (a + 1);
  }
  else {
    blue = amari + (A * a);
  }
  System.out.println(blue);
 }
}