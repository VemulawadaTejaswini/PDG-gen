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
      
      
      System.out.println(count);
        
      
      sc.close();
        

     
     
    }
}