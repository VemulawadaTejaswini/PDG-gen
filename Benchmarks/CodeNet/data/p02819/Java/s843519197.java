import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    
    if(x == 2){
      System.out.println(x);
      System.exit(0);
    }
    
    boolean s = false;
    
    while(s == false){
      
      
      for(int i = 2; i < x; i ++){
        if(x % i == 0){
          s = false;
          break;
        }
        s = true;
      }
      
      
      
      x += 1;
    }
    
    System.out.println(x-1);
    
  }
}
