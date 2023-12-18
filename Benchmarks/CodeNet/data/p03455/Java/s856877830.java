import java.util.*;
public class Main {
  public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
    String result;
    
    
    if (scn.nextInt() % 2 == 0) {
    	result = "Even";
    } else {
        scn.nextInt() % 2 ? result = "Odd" : result = "Even";
    }
    
    System.out.println(result);
  }
}
