import java.util.*;

public class Main {    
    
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);                  
                
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    if(M >= 2*N){
       System.out.println(N + (M - 2*N)/4);
       return;
    }else{              
       System.out.println(M/2);
       return;
    }      
    
  }    
}