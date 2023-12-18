import java.util.Scanner;

public class Main{

  public static void main(String[] args){
            
      Scanner reader = new Scanner(System.in);
      int numElectns = reader.nextInt();
      
      int canA = 1;
      int canB = 1;
      
      
      for(int i = 0; i < numElectns; i++){
         int rA = reader.nextInt();
         int rB = reader.nextInt();
         
         while((double)canA/canB != (double)rA/rB){
         
            double r = (double)rA/rB;
            
            if((double)canA/canB < r){
               if((r*canB)%1.0 != 0){
                  canA = (int)(1 + r*canB);
               } else {
                  canA = (int)(r*canB);
               }
               
            } else if((double)canA/canB > r){
               if((canA/r)%1.0 != 0){
                  canB = (int)(1 + (canA/r));
               } else {
                  canB = (int)(canA/r);
               }
            }
            
            //System.out.println(canA + " " + canB);
            
         }
            
      }   
      
      System.out.println((canA + canB)); 
      
  }     
   
}

      