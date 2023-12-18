import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String N = sc.next();
    int intN = Integer.parseInt(N);
    int sum = 0;

    for(int i = 0; i <= 8; i++){
      sum += intN % 10;
      intN = intN / 10;
      if(intN == 0){
        break;
      }
    }
    String output = null;
    
    if(intN % sum == 0){
      output = "Yes";
    }
    else
    {
      output = "No";
    }
            
    System.out.println(output);
  }
}