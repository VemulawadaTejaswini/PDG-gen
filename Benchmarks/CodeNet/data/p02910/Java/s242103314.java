import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String steps = sc.next();
    String easy = "Yes";
    
    
    for ( int i = 0; i<steps.length(); i++){
      if (i%2 == 0){
        if(steps.substring(i,i+1).equals("L")){
          easy = "No";
          break;
        }
      } else {
          if(steps.substring(i,i+1).equals("R")){
          easy = "No";
          break;
          }
        }
    }
    
    System.out.println(easy);
    
  }
}
