import java.util.*;
import java.lang.*;



public class Main {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
    
    
     String str=sc.nextLine();
     
     for(int i=0;i<str.length();i++){
         
         if(Character.isUpperCase(str.charAt(i))){
            System.out.print(Character.isLowerCase(str.charAt(i))) ;
         }else if(Character.isLowerCase(str.charAt(i))){
            System.out.print(Character.isUpperCase(str.charAt(i)));
         }else{

         System.out.print(charAt(i));}
         
         
     }System.out.println("");
      
      
    } 
     
}


