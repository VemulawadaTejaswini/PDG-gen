

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
      int b = scanner.nextInt();
       int c = scanner.nextInt();
     if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
         System.out.println("Yes");
     } else  if(a<0 || b<0 || c<0){
         System.out.println("No");
     } else 
             {
             System.out.println("No");
             }
    }
    
}
