import java.util.Scanner;
public class main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int x = scan.next();
  int y = scan.next();
  int z = scan.next();
  swap(x,y);
  swap(x,z);
 }
 
 void swap(int a,int b){
  int temp= a;
  a = b;
  b = temp;
 }
}
