import java.util.*;
 
class Main {
static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
  
    int tate = scan.nextInt();
    int yoko = scan.nextInt();
    
    tate -= 1;
    yoko -= 1;
    
    System.out.println(tate*yoko);
  }
}