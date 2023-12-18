import java.util.*;
class Main {
  public static void main (String[] args) {
    
    Scanner scan = new Scanner (System.in);
    
    int x = scan.nextInt();
    String str = x.toString();
    
    if (str.charAt(0)==1){
      x = x + 800;
      }else{
        x = x -800;
        }
      
        if (str.charAt(1)==1){
      x = x + 80;
      }else{
        x = x -80;
        }
        
          if (str.charAt(2)==1){
      x = x + 8;
      }else{
        x = x -8;
        }
    
    return x;
}
}