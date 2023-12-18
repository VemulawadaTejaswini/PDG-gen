import java.util.*;


public class Main {// Main
    public static void main(String[] args){

        Scanner sc =   new Scanner(System.in);
        String S = sc.next();

         if (S.startsWith("k")) {
             if(S.endsWith("eyence")){
                System.out.println("YES");
               
             }
        } else
         if (S.startsWith("ke")) {
             if(S.endsWith("yence")){
                System.out.println("YES");
               
             }
        } else
         if (S.startsWith("key")) {
             if(S.endsWith("ence")){
                System.out.println("YES");
                
             }
        } else
         if (S.startsWith("keye")) {
             if(S.endsWith("nce")){
                System.out.println("YES");
                
             }
        } else
         if (S.startsWith("keyen")) {
             if(S.endsWith("ce")){
                System.out.println("YES");
            
             }
        } else
         if (S.startsWith("keyenc")) {
             if(S.endsWith("e")){
                System.out.println("YES");
                
             }
        } else
         if (S.startsWith("keyence")) {
             
                System.out.println("YES");
                
             
        } else 
        if ( S.endsWith("keyence")) {
                System.out.println("YES");
            
        } else if(true==true){
            System.out.println("NO");
        }
    }    
}