import java.util.*;


public class Main{
           
    public static void main(String[] args){            
        
       Scanner sc = new Scanner(System.in);               
      
       int sx = sc.nextInt();
       int sy = sc.nextInt();
       int tx = sc.nextInt();
       int ty = sc.nextInt();
       
       String S = "";
       
       for(int i = 0;i < Math.abs(tx-sx);i++){
           S += "R";
       }
       
       for(int i = 0 ;i < Math.abs(ty-sy);i++){
           S += "U";
       }
       
       for(int i = 0 ; i < Math.abs(tx-sx);i++){
           S += "L";
       }
       
       for(int i= 0 ;i < Math.abs(ty-sy);i++){
           S += "D";
       }
       
       S += "D";
       
        for(int i = 0;i < Math.abs(tx-sx) + 1;i++){
           S += "R";
       }
       
        for(int i = 0 ;i < Math.abs(ty-sy) + 2;i++){
           S += "U";
       }
        
        for(int i = 0 ; i < Math.abs(tx-sx) + 2;i++){
           S += "L";
       }
        
        for(int i= 0 ;i < Math.abs(ty-sy)+1;i++){
           S += "D";
       }

        S += "R";
        
        System.out.println(S);
       
    }
                                       
}