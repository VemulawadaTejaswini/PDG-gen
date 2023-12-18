import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<char> ODD_STEP = new HashSet<String>(Arrays.asList("R","U","D"));
    Set<char> EVEN_STEP = new HashSet<String>(Arrays.asList("L","U","D"));
    int current_step = 0;
    String steps = sc.next();
    // "RUDLUDR"
    for(int i=0; i<100;i++){
      char step = steps.charAt(i);
      if(i % 2 == 0 && !EVEN_STEP.contains(step)){
        break;
      }else if(i % 2 != 0 && !ODD_STEP.contains(step)){
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