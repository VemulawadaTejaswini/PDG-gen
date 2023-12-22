import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while(true){
    int x = scan.nextInt();
    int y = scan.nextInt();
    if( x == 0 && y == 0 )break;
    if( x > y ){
    System.out.println(""+y+" "+x+"");
    }else{
    System.out.println(""+x+" "+y+"");
    }     
   }
  }
}