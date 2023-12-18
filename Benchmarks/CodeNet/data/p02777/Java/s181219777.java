import java.util.Scanner;                   

public class Main {                                 
    public static void main(String[] args) {                
        Scanner scan = new Scanner(System.in);          
        String S = scan.nextString();          
        String T = scan.nextString();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String U = scan.nextString();
      
        if(U.equals(S)){
        	num1--;
        }else if(U.equals(T)){
         	num2--; 
        }

      	System.out.print(num1 + " " + num2);
    }
}