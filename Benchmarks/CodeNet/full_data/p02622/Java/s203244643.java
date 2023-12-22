

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
  String a=in.nextLine();
  String b=in.nextLine();
  int count=0;
        for (int i = 0; i <b.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)) {
                count++;
                
            }
            
        }
        System.out.println(count);
  
   
    }
    
}
   

      
