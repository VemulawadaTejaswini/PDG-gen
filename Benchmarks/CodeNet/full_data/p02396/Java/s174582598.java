import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int i = 1;
    while( x != 0 ){
    System.out.println("Case "+i+": "+x+"");
    i++;
    Scanner scan = new Scanner(System.in);
    x = scan.nextInt();
   }
  }
}