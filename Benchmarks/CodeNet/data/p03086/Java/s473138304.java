import java.util.Scanner;

 
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      char[]c = s.toCharArray();
      
      
      for(int i = 0; i < c.length; i++){
        if(c[i] == 'C' ||c[i] == 'G' ||c[i] == 'T'){
          c[i] = 'A';
        }
      }
      
      int count =0;
      
       for(int i = 0; i < c.length; i++){
        if(c[i] == 'A'){
          count++;
        } else {
          break;
        }
      }
      
      int countato = 0;
      
      for(int i = c.length-1 ; i >= 0; i--){
        if(c[i] == 'A'){
          countato ++;
        } else {
          break;
        }
      }
      
      
      if(count >= countato){
        System.out.println(count);
      } else {
        System.out.println(countato);
      }
        
      
      sc.close();
        

     
     
    }
}
          
    
        
       