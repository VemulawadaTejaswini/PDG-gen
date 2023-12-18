import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<String> ODD_STEP = new HashSet<String>(Arrays.asList("R","U","D"));
    Set<String> EVEN_STEP = new HashSet<String>(Arrays.asList("L","U","D"));
    int current_step = 0;
    
    for(int i=0; i<100;i++){
      String step = sc.next();
      if(step %2 == 0 && !EVEN_STEP.contains(step)){
        break;
      }else if(step %2 != 0 && !ODD_STEP.contains(step)){
        break;
      }
      current_step++;
    }
    
    if(current_step == 100){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  
  }
 
}