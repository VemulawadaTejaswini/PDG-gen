import java.util.*;

public class Main {    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);                
         
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        String S = "";
        
        if(A > B){
            S = "GREATER";
        }else if(A < B){
            S = "LESS";
        }else{
            S = "EQUAL";
        }
        
        System.out.println(S);        
        
    }            
}

        
        
        
        