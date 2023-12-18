import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cake = 4;
    int donatu = 7;
    
    while(true){
      
      for(int i=0 ; ; i++){
        
        int total = cake*i; 
        
        if(total==n){
          System.out.println("Yes");
          return;
        }
        
        if(total>n){
          System.out.println("No");
        }
        
        for(int j=0 ; ; j++){
          
          total +=  donatu*j;
          if(total==n){
          System.out.println("Yes");
          return;
        }
        
        if(total>n){
          System.out.println("No");
        }
        }
      }
    }
  }
}
          
        