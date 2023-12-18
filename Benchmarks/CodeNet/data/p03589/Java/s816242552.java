import java.util.*;

public class Main {               
    
  public static void main(String[] args) {     
     
     Scanner sc = new Scanner(System.in);                                                                                               
                                               
     int N = sc.nextInt();
     
     for(int h = 1;h <= 3500;h++){
         for(int n = 1;n <= 3500;n++){
             for(int w = 1;w <= 3500;w++){
                 if(4*h*n*w == N*(n*w + w*h + h*n)){
                     System.out.println(h + " " + n + " " + w);
                     return;
                 }
             }   
         }         
     }
      
  }          
}
        
        