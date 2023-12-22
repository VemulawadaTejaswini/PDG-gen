import java.util.*;
import java.lang.*;



public class Main {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
    
    
     String str=sc.nextLine();
     char[] moji=str.toCharArray();
     for(int i=0;i<str.length();i++){
         if(Character.toUpperCase(moji[i])){
             moji[i]=Character.isLowerCase(moji[i]);
         }else if(Character.isLowerCase(moji[i])){
             moji[i]=Character.toUpperCase(moji[i]);
         }
         
         
         
     }System.out.println(moji);
      
      
    } 
     
}

