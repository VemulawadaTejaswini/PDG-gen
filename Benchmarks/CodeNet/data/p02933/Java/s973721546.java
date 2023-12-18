import java.util.Scanner;
public class Main{
    
public static void main( String args[]) {
  Scanner sc = new Scanner(System.in);
   String s ;
    s = sc.nextLine();
  int n = sc.nextInt();
   if(n<3600)
    System.out.println("red");
    else 
    System.out.println(s);
}       
    }