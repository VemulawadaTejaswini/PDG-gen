import java.util.*;
class Main{
   public static void main(System args[]){
      Scanner stdIn = Scanner(System.in);
      int i = 0;
      while(i){
         int a[i] = stdIn.nextInt();
         String op[i] = stdIn.next();
         int b[i] = stdIn.nextInt();
        
         if(op[i] == "?") break;

         i++;
      }
      
      for(int j = 0, j<i, j++){
         if(op[j] == "+")
            System.out.println(a[j]+b[j]);
       
         else if(op[j] == "-")
            System.out.println(a[j]-b[j]);

         else if(op[j] == "*")
            System.out.println(a[j]*b[j]);

         else if(op[j] == "/")
            System.out.println(a[j]/b[j]);
      }
   }
}