import java.util.InputMismatchException;
import java.util.Scanner;

class test{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter("\\s");
       int a=0,b=0;
       try{
        a = sc.nextInt();
        b = sc.nextInt();
       }catch(InputMismatchException e){
    	  
       }
       if(a >= 1 && b <= 100){
          System.out.print(a*b + " " + (a*2 + b*2) + "\n");
       }
   }
}