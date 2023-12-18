import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<Character> ODD_STEP = new HashSet<Character>();
    Set<Character> EVEN_STEP = new HashSet<Character>();
    String ODD_STEP_STR = "RUD";
    String EVEN_STEP_STR = "LUD";

    for(int i=0; i<3; i++){
        ODD_STEP.add(ODD_STEP_STR.charAt(i));
        EVEN_STEP.add(EVEN_STEP_STR.charAt(i));
    }


    
    int current_step = 0;
    String steps = sc.next();
    // "RUDLUDR"
    // System.out.println(steps);
    for(int i=0; i<steps.length();i++){
      char step = steps.charAt(i);
    //   System.out.println(step);
      if((i+1) % 2 == 0 && !EVEN_STEP.contains(step)){
        // System.out.println("EVEN but not " + step);
        break;
      }else if((i+1) % 2 != 0 && !ODD_STEP.contains(step)){
        // System.out.println("ODD but not " + step);
        break;
      }
      current_step++;
    }
    
    if(current_step == steps.length()){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}