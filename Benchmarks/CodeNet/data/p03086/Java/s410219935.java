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
         if(c[i] != 'A'){
           if(i == 0){
             continue;
           } else if(c[i - 1] == 'A'){
             break;
           } else {
             continue;
           }
         } else if(c[i] == 'A'){
           count++;
         } 
       
      }
      
      int countato = 0;
      
      for(int i = c.length-1 ; i >= 0; i--){
        if(c[i] != 'A'){
          if(i == c.length -1){
            continue;
          } else if(c[i + 1] == 'A'){
            break;
          } else {
            continue;
          }
        } else if (c[i] == 'A') {
          countato++;
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
          
    
        