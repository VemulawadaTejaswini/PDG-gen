import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    String red = scanner.next();
    String blue = scanner.next();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    String which = scanner.next();
    
    if(which.length()==red.length()){
      a --;
    }else{
      b --;
    }
      
    System.out.println(a + " " + b);
  }
}