import java.util.*;

public class Main {    
    
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);                  
                
    double N = sc.nextDouble();
    double M = sc.nextDouble();
    
    if(M >= 2*N){
       System.out.println((int)(N + (M - 2*N)/4));
       return;
    }else{              
       System.out.println((int)M/2);
       return;
    }      
    
  }    
}
