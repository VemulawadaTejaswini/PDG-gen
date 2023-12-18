import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    
      int a,b;
      a = sc.nextInt(); 
      b = sc.nextInt(); 
      int sum = 1;
       
      
     for(int i = a; i <= b; i++) {
       sum *= i;
}

 if(sum == 0) {
           System.out.print("Zero");
        } else if(sum < 0) {
          System.out.print("Negative");
       } else if(sum > 0) {
         System.out.print("Positive");
       }
      
    }
}